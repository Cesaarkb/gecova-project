package mx.com.santander.hexagonalmodularmaven.user.rest.advice;

import mx.com.santander.hexagonalmodularmaven.peticion.adapter.PeticionErrorResponse;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionException;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionInputException;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionNotFoundException;
import mx.com.santander.hexagonalmodularmaven.peticion.rest.advice.PeticionAdviceController;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

class PeticionAdviceControllerTest {

    private final PeticionAdviceController advice = new PeticionAdviceController();

    @Test
    void handlePeticionExceptionBadRequestClienteMalo(){
    String errorMessage ="cliente no existe";
    PeticionException ex = new PeticionException(errorMessage);
    PeticionAdviceController handler = new PeticionAdviceController();

    ResponseEntity<PeticionErrorResponse> responseEntity = handler.handlePeticionException(ex);
    PeticionErrorResponse body = responseEntity.getBody();
        assertNotNull(body);
        assertEquals(HttpStatus.BAD_REQUEST.value(), body.getStatus());
        assertEquals("Cliente malo", body.getError());
        assertEquals(errorMessage, body.getMessage());
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
        assertNotNull(body.getTimestamp());
    }
    @Test
    void handlePeticionException_returnsBadRequestResponse() {
        String message = "Datos inválidos en la petición";
        PeticionInputException ex = new PeticionInputException(message);

        ResponseEntity<PeticionErrorResponse> responseEntity = advice.handleCustomerInputException(ex);

        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());

        PeticionErrorResponse body = responseEntity.getBody();
        assertNotNull(body);
        assertEquals(HttpStatus.BAD_REQUEST.value(), body.getStatus());
        assertEquals("Datos invalidos", body.getError());
        assertEquals(message, body.getMessage()); // Aquí antes fallaba
        assertNotNull(body.getTimestamp());
    }

    @Test
    void handlePeticionInputException_returnsBadRequestResponse() {
        String message = "Datos inválidos en la petición";
        PeticionInputException ex = new PeticionInputException(message);

        ResponseEntity<PeticionErrorResponse> responseEntity = advice.handleCustomerInputException(ex);

        assertEquals(BAD_REQUEST, responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());
        PeticionErrorResponse body = responseEntity.getBody();
        assertEquals(BAD_REQUEST.value(), body.getStatus());
        assertEquals("Datos invalidos", body.getError());
        assertEquals(message, body.getMessage());
        assertNotNull(body.getTimestamp());
    }

    @Test
    void handlePeticionNotFoundException_returnsNotFoundResponse() {
        String message = "Petición no encontrada";
        PeticionNotFoundException ex = new PeticionNotFoundException(message);

        ResponseEntity<PeticionErrorResponse> responseEntity = advice.handlePeticionNotFoundException(ex);

        assertEquals(NOT_FOUND, responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());
        PeticionErrorResponse body = responseEntity.getBody();
        assertEquals(NOT_FOUND.value(), body.getStatus());
        assertEquals("Not Found", body.getError());
        assertEquals(message, body.getMessage());
        assertNotNull(body.getTimestamp());
    }
}