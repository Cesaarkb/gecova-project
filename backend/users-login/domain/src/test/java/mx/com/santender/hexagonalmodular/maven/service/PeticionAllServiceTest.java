package mx.com.santender.hexagonalmodular.maven.service;

import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.port.dao.IPeticionDAO;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionAllService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PeticionAllServiceTest {

    private IPeticionDAO peticionDAO;
    private PeticionAllService service;

    @BeforeEach
    void setUp() {
        peticionDAO = mock(IPeticionDAO.class);
        service = new PeticionAllService(peticionDAO);
    }

    @Test
    void shouldReturnListOfPeticionModel() {
        PeticionModel model1 = new PeticionModel();
        PeticionModel model2 = new PeticionModel();

        when(peticionDAO.findAll()).thenReturn(List.of(model1, model2));

        List<PeticionModel> result = service.execute();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of(model1, model2)));

        verify(peticionDAO, times(1)).findAll();
    }

}