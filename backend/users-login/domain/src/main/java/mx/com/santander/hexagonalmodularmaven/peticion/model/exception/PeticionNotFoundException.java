package mx.com.santander.hexagonalmodularmaven.peticion.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class PeticionNotFoundException extends RuntimeException{
    private String errorMessage;

    public PeticionNotFoundException(String message) {
        super(message);
    }
}
