package mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator.JwtProperties;
import mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator.JwtTokenGenerator;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;

@ExtendWith(MockitoExtension.class)
public class JwtTokenGeneratorTest {

    private JwtProperties jwtProperties;
    private JwtTokenGenerator tokenGenerator;
	
    @BeforeEach
    void setUp() {
        jwtProperties = mock(JwtProperties.class);
        when(jwtProperties.getSecretKey()).thenReturn("miClaveSecreta123456");
        when(jwtProperties.getExpirationMS()).thenReturn(3600000L);

        tokenGenerator = new JwtTokenGenerator(jwtProperties);
    }
	
	
	@Test
	void test_CreacionDeToken() {
		User user = new User(1L, "usuario", "password");
		
		  String token = tokenGenerator.generateToken(user);

	        assertNotNull(token);
	        assertFalse(token.isEmpty());

	        DecodedJWT decodedJWT = JWT.require(Algorithm.HMAC256("miClaveSecreta123456"))
	                                   .build()
	                                   .verify(token);

	        assertEquals("usuario", decodedJWT.getSubject());

	        Date issuedAt = decodedJWT.getIssuedAt();
	        Date expiresAt = decodedJWT.getExpiresAt();

	        assertNotNull(issuedAt);
	        assertNotNull(expiresAt);
	        assertTrue(expiresAt.after(issuedAt));
	}

}
