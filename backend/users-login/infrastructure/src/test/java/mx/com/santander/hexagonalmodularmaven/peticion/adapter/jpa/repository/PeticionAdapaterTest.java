package mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.repository;

import mx.com.santander.hexagonalmodularmaven.peticion.adapter.entity.PeticionEntity;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.IPeticionAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.mapper.PeticionMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionCustomer;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionManagerName;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionOrganizationUnit;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PeticionAdapaterTest {

    @Mock
    private IPeticionAdapterRepository repository;

    @Mock
    private PeticionMapper mapper;

    @InjectMocks
    private PeticionAdapater adapter;

    @Test
    void testCreate_success() {
        PeticionModel model = mock(PeticionModel.class);
        PeticionEntity entity = mock(PeticionEntity.class);

        when(mapper.toEntity(model)).thenReturn(entity);
        when(repository.save(entity)).thenReturn(entity);
        when(mapper.toDomain(entity)).thenReturn(model);


        PeticionModel result = adapter.create(model);


        assertNotNull(result);
        assertEquals(model, result);
        verify(mapper).toEntity(model);
        verify(repository).save(entity);
        verify(mapper).toDomain(entity);
    }

    @Test
    void testUpdate_success() {
        Long id = 1L;
        PeticionModel model = mock(PeticionModel.class);
        PeticionEntity entity = new PeticionEntity();

        when(repository.findById(id)).thenReturn(Optional.of(entity));
        when(repository.save(entity)).thenReturn(entity);
        when(mapper.toDomain(entity)).thenReturn(model);

        PeticionCustomer customer = mock(PeticionCustomer.class);
        PeticionOrganizationUnit organizationUnit = mock(PeticionOrganizationUnit.class);
        PeticionManagerName managerName = mock(PeticionManagerName.class);

        when(model.getCustomer()).thenReturn(customer);
        when(customer.getCustomer()).thenReturn("cliente");

        when(model.getOrganizationUnit()).thenReturn(organizationUnit);
        when(organizationUnit.getOrganizationUnit()).thenReturn("unidad");

        when(model.getManagerName()).thenReturn(managerName);
        when(managerName.getManagerName()).thenReturn("gestor");

        when(repository.findById(id)).thenReturn(Optional.of(entity));
        when(repository.save(entity)).thenReturn(entity);
        when(mapper.toDomain(entity)).thenReturn(model);

        PeticionModel result = adapter.update(id, model);

        assertNotNull(result);
        assertEquals(model, result);
        verify(repository).findById(id);
        verify(repository).save(entity);
        verify(mapper).toDomain(entity);
    }

    @Test
    void testUpdate_notFound_throwsException() {
        Long id = 999L;
        PeticionModel model = mock(PeticionModel.class);

        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(PeticionNotFoundException.class, () -> adapter.update(id, model));
        verify(repository).findById(id);
        verify(repository, never()).save(any());
        verify(mapper, never()).toDomain(any());
    }

    @Test
    void testDelete_success() {
        Long id = 1L;
        PeticionEntity entity = new PeticionEntity();

        when(repository.findById(id)).thenReturn(Optional.of(entity));

        adapter.delete(id);

        verify(repository).findById(id);
        verify(repository).delete(entity);
    }

    @Test
    void testDelete_notFound_throwsException() {
        Long id = 999L;
        when(repository.findById(id)).thenReturn(Optional.empty());

        assertThrows(PeticionNotFoundException.class, () -> adapter.delete(id));
        verify(repository).findById(id);
        verify(repository, never()).delete(any());
    }

}