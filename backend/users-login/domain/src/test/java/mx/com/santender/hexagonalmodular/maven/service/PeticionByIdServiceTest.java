package mx.com.santender.hexagonalmodular.maven.service;

import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.port.dao.IPeticionDAO;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionByIdService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class PeticionByIdServiceTest {

    private IPeticionDAO peticionDAO;
    private PeticionByIdService service;

    @BeforeEach
    void setUp() {
        peticionDAO = mock(IPeticionDAO.class);
        service = new PeticionByIdService(peticionDAO);
    }

    @Test
    void shouldReturnPeticionModel_whenFoundById() {
        Long id = 5L;
        PeticionModel model = new PeticionModel();

        when(peticionDAO.findById(id)).thenReturn(model);

        // Act
        PeticionModel result = service.execute(id);

        // Assert
        assertNotNull(result);
        assertEquals(model, result);

        verify(peticionDAO, times(1)).findById(id);
    }

}