package mx.com.santender.hexagonalmodular.maven.user.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import mx.com.santander.hexagonalmodularmaven.user.port.security.TokenProvider;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGenerateTokenService;

@ExtendWith(MockitoExtension.class)
public class UserGenerateTokenServiceTest {
	
	
	@Mock
	private TokenProvider tokenProvider;
	
	@InjectMocks
	private UserGenerateTokenService service;
	
	@Test
	void test_DebeRetornarTokenGenerado(){
		User user = new User(1L,"usarname","password");
		String tokenEsperado = "123.456.789";
		
		when(tokenProvider.generateToken(user)).thenReturn(tokenEsperado);
		
		String tokenReal = service.execute(user);
		
		assertEquals(tokenEsperado, tokenReal);
		verify(tokenProvider).generateToken(user);
		
		
		
	}
}
