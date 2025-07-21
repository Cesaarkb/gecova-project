package mx.com.santander.hexagonalmodularmaven.peticion.rest.advice;

import mx.com.santander.hexagonalmodularmaven.peticion.adapter.PeticionErrorResponse;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionException;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionInputException;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class PeticionAdviceController {

    @ExceptionHandler(PeticionException.class)
    public ResponseEntity<PeticionErrorResponse> handlePeticionException(PeticionException ex){
        PeticionErrorResponse response = new PeticionErrorResponse(LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),"Cliente malo",ex.getMessage());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PeticionInputException.class)
    public ResponseEntity<PeticionErrorResponse> handleCustomerInputException(PeticionInputException ex){
        PeticionErrorResponse response = new PeticionErrorResponse(LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(), "Datos invalidos",ex.getMessage());

        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PeticionNotFoundException.class)
    public ResponseEntity<PeticionErrorResponse> handlePeticionNotFoundException(PeticionNotFoundException nf){
        PeticionErrorResponse response = new PeticionErrorResponse(LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(), "Not Found",
                nf.getMessage());

        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
