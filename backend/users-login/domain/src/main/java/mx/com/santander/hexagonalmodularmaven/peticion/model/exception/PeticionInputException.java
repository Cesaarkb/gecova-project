package mx.com.santander.hexagonalmodularmaven.peticion.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class PeticionInputException extends RuntimeException{
    private String errorMessage;

    public PeticionInputException(String message) {
        super(message);
    }
}
