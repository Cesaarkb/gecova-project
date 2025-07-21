package mx.com.santender.hexagonalmodular.maven.service;

import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.command.PeticionCreateCommand;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionCreateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class PeticionCreateServiceTest {

    private IPeticionRepository peticionRepository;
    private PeticionCreateService service;

    @BeforeEach
    void setUp() {
        peticionRepository = mock(IPeticionRepository.class);
        service = new PeticionCreateService(peticionRepository);
    }

    @Test
    void shouldReturnCreatedPeticionModel_whenExecute() {
        PeticionCreateCommand command = new PeticionCreateCommand();

        PeticionModel peticionToCreate = new PeticionModel();
        PeticionModel createdPeticion = new PeticionModel();

        when(peticionRepository.create(any(PeticionModel.class))).thenReturn(createdPeticion);

        PeticionModel result = service.execute(command);

        assertNotNull(result);
        assertEquals(createdPeticion, result);

        verify(peticionRepository, times(1)).create(any(PeticionModel.class));
    }

}