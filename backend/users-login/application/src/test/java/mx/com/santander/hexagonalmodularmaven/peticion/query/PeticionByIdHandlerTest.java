package mx.com.santander.hexagonalmodularmaven.peticion.query;

import mx.com.santander.hexagonalmodularmaven.peticion.mapper.IPeticionDTOMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionByIdService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class PeticionByIdHandlerTest {


    private IPeticionDTOMapper mapper;
    private PeticionByIdService peticion;
    private PeticionByIdHandler handler;

    @BeforeEach
    void setUp() {
        mapper = mock(IPeticionDTOMapper.class);
        peticion = mock(PeticionByIdService.class);
        handler = new PeticionByIdHandler(mapper, peticion);
    }

    @Test
    void shouldReturnPeticionDTO_whenExecuteIsCalled() {
        Long id = 10L;
        PeticionModel peticionEntity = new PeticionModel();
        PeticionDTO dto = new PeticionDTO();

        when(peticion.execute(id)).thenReturn(peticionEntity);
        when(mapper.toDTO(peticionEntity)).thenReturn(dto);

        PeticionDTO result = handler.execute(id);

        assertNotNull(result);
        assertEquals(dto, result);

        verify(peticion).execute(id);
        verify(mapper).toDTO(peticionEntity);
    }

}