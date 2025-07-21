package mx.com.santander.hexagonalmodularmaven.peticion.command;

import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionDeleteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PeticionDeleteHandlerTest {
    private PeticionDeleteService service;
    private PeticionDeleteHandler handler;

    @BeforeEach
    void setUp() {
        service = mock(PeticionDeleteService.class);
        handler = new PeticionDeleteHandler(service);
    }

    @Test
    void shouldCallServiceExecuteWithCorrectId() {

        Long id = 42L;

        handler.execute(id);
        verify(service, times(1)).execute(id);
    }

}