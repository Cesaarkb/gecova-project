package mx.com.santander.hexagonalmodularmaven.peticion.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PeticionException extends RuntimeException{

    private String errorMessage;

    public PeticionException(String error){
        super(error);
    }
}
