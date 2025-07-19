package mx.com.santander.hexagonalmodularmaven.user.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import mx.com.santander.hexagonalmodularmaven.user.port.security.TokenProvider;

/**
 * clase implementadora de la interface TokenProvider, método generateToken
 */
@RequiredArgsConstructor
public class UserGenerateTokenService {
	
	private final TokenProvider TokenProvider;
	
	public String execute(User user) {
		return TokenProvider.generateToken(user);
	}

}
