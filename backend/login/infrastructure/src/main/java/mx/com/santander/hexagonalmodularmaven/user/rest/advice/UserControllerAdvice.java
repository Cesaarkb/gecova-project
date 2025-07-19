package mx.com.santander.hexagonalmodularmaven.user.rest.advice;


import mx.com.santander.hexagonalmodularmaven.user.exception.IncorrectCredentialsException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(IncorrectCredentialsException.class)
    public ResponseEntity<String> handleEmptyInput(IncorrectCredentialsException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleEmptyInput(MethodArgumentNotValidException ex){
    	Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error -> {
            errors.put(error.getField(), error.getDefaultMessage());
        });

        return ResponseEntity.badRequest().body(errors);
    }

}
