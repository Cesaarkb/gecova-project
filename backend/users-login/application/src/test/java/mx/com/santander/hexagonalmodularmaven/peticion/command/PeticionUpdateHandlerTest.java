package mx.com.santander.hexagonalmodularmaven.peticion.command;

import mx.com.santander.hexagonalmodularmaven.peticion.mapper.IPeticionDTOMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionUpdateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class PeticionUpdateHandlerTest {

    private PeticionUpdateService service;
    private IPeticionDTOMapper mapper;
    private PeticionUpdateHandler handler;

    @BeforeEach
    void setUp() {
        service = mock(PeticionUpdateService.class);
        mapper = mock(IPeticionDTOMapper.class);
        handler = new PeticionUpdateHandler(mapper, service);
    }

    @Test
    void shouldReturnPeticionDTO_whenExecuteIsCalled() {
        Long id = 99L;
        PeticionModel inputModel = new PeticionModel();
        PeticionModel updatedEntity = new PeticionModel();
        PeticionDTO expectedDTO = new PeticionDTO();

        when(service.execute(id, inputModel)).thenReturn(updatedEntity);
        when(mapper.toDTO(updatedEntity)).thenReturn(expectedDTO);

        PeticionDTO result = handler.execute(id, inputModel);

        assertNotNull(result);
        assertEquals(expectedDTO, result);
        verify(service).execute(id, inputModel);
        verify(mapper).toDTO(updatedEntity);
    }
}