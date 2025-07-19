package mx.com.santander.hexagonalmodularmaven.user.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.user.port.security.UserHashedPassword;

/*
 * Clase implementadora de la interface UserHashedPassword, método verify 
 */

@RequiredArgsConstructor
public class UserValidatePasswordService {
	
	private final UserHashedPassword userHashedPassword;
	
	public boolean execute(String rawPassword, String hashedPassword) {
		return userHashedPassword.verify(rawPassword, hashedPassword);
	}

}
