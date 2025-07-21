package mx.com.santander.hexagonalmodularmaven.user.query;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.user.exception.IncorrectCredentialsException;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGenerateTokenService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGetByUsernameService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserValidatePasswordService;

import java.util.Optional;

import org.springframework.stereotype.Component;

/**
 * Handler encargado de la autenticación de usuarios.
 * <p>
 * Valida la existencia del usuario, verifica las credenciales y genera un token de sesión.
 * </p>
 */

@Component
@RequiredArgsConstructor
public class UserAuthenticationHandler {

	private final UserGenerateTokenService userGenerateTokenService;
	private final UserGetByUsernameService userGetByUsernameService;
	private final UserValidatePasswordService userValidatePasswordService;
	
    /**
     * Ejecuta el proceso de autenticación de usuario.
     *
     * @param username    nombre de usuario a autenticar
     * @param rawPassword contraseña en texto plano proporcionada por el usuario
     * @return token JWT generado para la sesión válida
     * @throws IncorrectCredentialsException si el usuario no existe o la contraseña es incorrecta
     */

	public String execute(String username, String rawPassword) {
		User user = userGetByUsernameService.execute(username);

		if (!userValidatePasswordService.execute(rawPassword, user.getPassword())) {
			throw new IncorrectCredentialsException();
		}
		
		return userGenerateTokenService.execute(user);
	}

}
