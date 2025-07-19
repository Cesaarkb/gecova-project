package mx.com.santander.hexagonalmodularmaven.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	/*
	 * Se enviará al usuario el token creado así como su duración, pendiente
	 * implementación de ROLES
	 */

    private String token;
}
