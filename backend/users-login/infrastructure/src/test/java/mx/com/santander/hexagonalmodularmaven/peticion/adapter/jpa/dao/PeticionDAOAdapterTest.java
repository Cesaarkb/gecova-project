package mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.dao;

import mx.com.santander.hexagonalmodularmaven.peticion.adapter.entity.PeticionEntity;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.IPeticionAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.mapper.PeticionMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionNotFoundException;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionAllService;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionByIdService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PeticionDAOAdapterTest {

    @Mock
    private IPeticionAdapterRepository repository;

    @Mock
    private PeticionMapper mapper;

    @InjectMocks
    private PeticionDAOAdapter adapter;

    @Test
    void testFindById_whenPeticionExists_returnsModel() {
        Long id = 1L;
        PeticionEntity entity = new PeticionEntity();
        entity.setId(id);

        PeticionModel model = mock(PeticionModel.class);

        when(repository.findById(id)).thenReturn(Optional.of(entity));
        when(mapper.toDomain(entity)).thenReturn(model);

        PeticionModel result = adapter.findById(id);

        assertNotNull(result);
        assertEquals(model, result);
        verify(repository).findById(id);
        verify(mapper).toDomain(entity);
    }

    @Test
    void testFindById_whenPeticionNotFound_throwsException() {
        Long id = 999L;
        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(PeticionNotFoundException.class, () -> adapter.findById(id));
        verify(repository).findById(id);
        verify(mapper, never()).toDomain(any());
    }

    @Test
    void testFindAll_returnsListOfModels() {
        PeticionEntity entity1 = new PeticionEntity();
        PeticionEntity entity2 = new PeticionEntity();
        List<PeticionEntity> entidades = List.of(entity1, entity2);

        PeticionModel model1 = mock(PeticionModel.class);
        PeticionModel model2 = mock(PeticionModel.class);
        List<PeticionModel> modelos = List.of(model1, model2);

        when(repository.findAll()).thenReturn(entidades);
        when(mapper.toDomain(entity1)).thenReturn(model1);
        when(mapper.toDomain(entity2)).thenReturn(model2);

        List<PeticionModel> result = adapter.findAll();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertFalse(false);
        assertEquals(modelos.size(), entidades.size());

    }
}