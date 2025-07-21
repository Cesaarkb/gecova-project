package mx.com.santander.hexagonalmodularmaven.user.port.security;

import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;


/*
 * interface para la generación de token
 */
public interface TokenProvider {
	
	String generateToken(User user);

}
