package mx.com.santander.hexagonalmodularmaven.user.exception;

public class IncorrectCredentialsException extends RuntimeException {
	public IncorrectCredentialsException() {
		super("Las credenciales ingresadas no son correctas");
	}

}
