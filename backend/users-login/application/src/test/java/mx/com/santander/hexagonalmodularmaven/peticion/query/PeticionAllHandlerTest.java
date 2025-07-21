package mx.com.santander.hexagonalmodularmaven.peticion.query;

import mx.com.santander.hexagonalmodularmaven.peticion.mapper.IPeticionDTOMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionAllService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PeticionAllHandlerTest {


    private IPeticionDTOMapper mapper;
    private PeticionAllService peticionAllService;
    private PeticionAllHandler handler;

    @BeforeEach
    void setUp() {
        mapper = mock(IPeticionDTOMapper.class);
        peticionAllService = mock(PeticionAllService.class);
        handler = new PeticionAllHandler(mapper, peticionAllService);
    }

    @Test
    void shouldReturnListOfPeticionDTO() {
        PeticionModel peticion1 = new PeticionModel();
        PeticionModel peticion2 = new PeticionModel();

        PeticionDTO dto1 = new PeticionDTO();
        PeticionDTO dto2 = new PeticionDTO();

        when(peticionAllService.execute()).thenReturn(List.of(peticion1, peticion2));
        when(mapper.toDTO(peticion1)).thenReturn(dto1);
        when(mapper.toDTO(peticion2)).thenReturn(dto2);

        List<PeticionDTO> result = handler.execute();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of(dto1, dto2)));

        verify(peticionAllService, times(1)).execute();
        verify(mapper, times(1)).toDTO(peticion1);
        verify(mapper, times(1)).toDTO(peticion2);
    }

}