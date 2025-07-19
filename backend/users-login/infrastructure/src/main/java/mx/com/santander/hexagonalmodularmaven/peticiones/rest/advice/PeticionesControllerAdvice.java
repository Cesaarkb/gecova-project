package mx.com.santander.hexagonalmodularmaven.peticiones.rest.advice;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PeticionesControllerAdvice {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> HandlePeticionNoEncontrada(RuntimeException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String>HandleDatosDuplicados(DataIntegrityViolationException ve){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("Ya existe un peticion con estos datos");
    }
}
