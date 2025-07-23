package mx.com.santander.hexagonalmodularmaven.peticion.model.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeticionNotFoundException extends RuntimeException{
    private String errorMessage;

    public PeticionNotFoundException(String message) {
        super(message);
    }
}
