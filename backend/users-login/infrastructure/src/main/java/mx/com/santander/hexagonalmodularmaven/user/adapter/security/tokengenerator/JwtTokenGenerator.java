package mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import mx.com.santander.hexagonalmodularmaven.user.port.security.TokenProvider;

@RequiredArgsConstructor
public class JwtTokenGenerator implements TokenProvider{
	
	private final JwtProperties jwtProperties;

	@Override
	public String generateToken(User user) {
		  Algorithm algorithm = Algorithm.HMAC256(jwtProperties.getSecretKey());

	        return JWT.create()
	                .withSubject(user.getUsername())
	                .withIssuedAt(new Date())
	                .withExpiresAt(new Date(System.currentTimeMillis() + jwtProperties.getExpirationMS()))
	                .sign(algorithm);
	}

}
