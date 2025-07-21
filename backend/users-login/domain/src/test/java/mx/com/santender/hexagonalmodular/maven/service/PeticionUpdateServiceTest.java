package mx.com.santender.hexagonalmodular.maven.service;

import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionUpdateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class PeticionUpdateServiceTest {

    private IPeticionRepository peticionRepository;
    private PeticionUpdateService service;

    @BeforeEach
    void setUp() {
        peticionRepository = mock(IPeticionRepository.class);
        service = new PeticionUpdateService(peticionRepository);
    }

    @Test
    void shouldReturnUpdatedPeticionModel_whenExecuteIsCalled() {
        Long id = 15L;
        PeticionModel inputModel = new PeticionModel();
        PeticionModel updatedModel = new PeticionModel();

        when(peticionRepository.update(id, inputModel)).thenReturn(updatedModel);

        PeticionModel result = service.execute(id, inputModel);

        assertNotNull(result);
        assertEquals(updatedModel, result);

        verify(peticionRepository, times(1)).update(id, inputModel);
    }

}