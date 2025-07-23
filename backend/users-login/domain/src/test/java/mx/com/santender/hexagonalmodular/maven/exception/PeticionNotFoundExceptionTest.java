package mx.com.santender.hexagonalmodular.maven.exception;

import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionNotFoundException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


 class PeticionNotFoundExceptionTest {

    @Test
    void peticionNotFoundLazaException(){

        assertThrows(PeticionNotFoundException.class, ()->{
            throw  new PeticionNotFoundException("peticon no encotrada");
        });
    }
}
