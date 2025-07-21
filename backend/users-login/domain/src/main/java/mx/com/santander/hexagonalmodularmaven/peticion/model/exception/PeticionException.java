package mx.com.santander.hexagonalmodularmaven.peticion.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeticionException extends RuntimeException{

    private String errorMessage;
}
