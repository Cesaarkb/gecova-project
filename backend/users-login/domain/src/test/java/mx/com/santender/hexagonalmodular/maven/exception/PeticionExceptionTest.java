package mx.com.santender.hexagonalmodular.maven.exception;

import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

    class PeticionExceptionTest {

    @Test
    void testpeticionException(){

        assertThrows(PeticionException.class, ()->{
            throw new PeticionException("peticon no encotrada");
        });
    }
}
