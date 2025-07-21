package mx.com.santander.hexagonalmodularmaven.user.rest.controller.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRequest {
	
	@NotBlank(message = "debes ingresar un username")
	private String username;
	@NotBlank(message = "Debes ingresar una contraseña")
	private String password;

}
