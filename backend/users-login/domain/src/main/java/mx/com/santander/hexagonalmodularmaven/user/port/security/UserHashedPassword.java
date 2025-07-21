package mx.com.santander.hexagonalmodularmaven.user.port.security;


/*
 * interface para validar que la contrasena enviada por usuario es la misma
 * que la constrasena guarada en BD (hasheada)
 */
public interface UserHashedPassword {
	
	boolean verify(String rawPassword, String hashedPassword);

}
