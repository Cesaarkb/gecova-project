package mx.com.santender.hexagonalmodular.maven.service;

import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionDeleteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PeticionDeleteServiceTest {

    private IPeticionRepository peticionRepository;
    private PeticionDeleteService service;

    @BeforeEach
    void setUp() {
        peticionRepository = mock(IPeticionRepository.class);
        service = new PeticionDeleteService(peticionRepository);
    }

    @Test
    void shouldCallRepositoryDelete_whenExecuteIsCalled() {
        Long id = 10L;

        service.execute(id);
        verify(peticionRepository, times(1)).delete(id);
    }

}