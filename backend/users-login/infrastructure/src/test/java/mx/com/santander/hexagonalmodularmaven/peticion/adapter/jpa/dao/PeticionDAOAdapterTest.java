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
    private PeticionAllService allService;

    @InjectMocks
    private PeticionByIdService byIdService;

    @Test
    void testFindById_whenPeticionExists_returnsModel() {
        Long id = 1L;
        PeticionEntity entity = new PeticionEntity();
        entity.setId(id);

        PeticionModel model = mock(PeticionModel.class);

        when(repository.findById(id)).thenReturn(Optional.of(entity));
        when(mapper.toDomain(entity)).thenReturn(model);

        PeticionModel result = byIdService.execute(id);

        assertNotNull(result);
        assertEquals(model, result);
        verify(repository).findById(id);
        verify(mapper).toDomain(entity);
    }

    @Test
    void testFindById_whenPeticionNotFound_throwsException() {
        Long id = 999L;
        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(PeticionNotFoundException.class, () -> byIdService.execute(id));
        verify(repository).findById(id);
        verify(mapper, never()).toDomain(any());
    }

    @Test
    void testFindAll_returnsListOfModels() {
        PeticionEntity e1 = new PeticionEntity();
        PeticionEntity e2 = new PeticionEntity();

        List<PeticionEntity> entities = List.of(e1, e2);

        PeticionModel m1 = mock(PeticionModel.class);
        PeticionModel m2 = mock(PeticionModel.class);

        when(repository.findAll()).thenReturn(entities);
        when(mapper.toDomain(e1)).thenReturn(m1);
        when(mapper.toDomain(e2)).thenReturn(m2);

        List<PeticionModel> result = allService.execute();

        assertEquals(2, result.size());
        assertTrue(result.contains(m1));
        assertTrue(result.contains(m2));
        verify(repository).findAll();
        verify(mapper).toDomain(e1);
        verify(mapper).toDomain(e2);
    }
}