package mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.repository;

import mx.com.santander.hexagonalmodularmaven.peticion.adapter.entity.PeticionEntity;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.IPeticionAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.mapper.PeticionMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.*;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
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

        PeticionApplicant applicant = mock(PeticionApplicant.class);
        when(model.getApplicant()).thenReturn(applicant);
        when(applicant.getApplicant()).thenReturn("solicitante");

        PeticionCompanyName companyName = mock(PeticionCompanyName.class);
        when(model.getCompanyName()).thenReturn(companyName);
        when(companyName.getCompanyName()).thenReturn("empresa");

        PeticionPriority priority = mock(PeticionPriority.class);
        when(model.getPriority()).thenReturn(priority);
        when(priority.getPriority()).thenReturn("alta");

        PeticionPosition position = mock(PeticionPosition.class);
        when(model.getPosition()).thenReturn(position);
        when(position.getPosition()).thenReturn(1);

        PeticionTypeContract typeContract = mock(PeticionTypeContract.class);
        when(model.getTypeContratc()).thenReturn(typeContract);
        when(typeContract.getTypeContract()).thenReturn("contrato");

        PeticionProjectCode projectCode = mock(PeticionProjectCode.class);
        when(model.getProjectCode()).thenReturn(projectCode);
        when(projectCode.getProjectCode()).thenReturn("PRJ123");

        PeticionProjectName projectName = mock(PeticionProjectName.class);
        when(model.getProjectName()).thenReturn(projectName);
        when(projectName.getProjectName()).thenReturn("Proyecto A");

        PeticionElementContract elementContract = mock(PeticionElementContract.class);
        when(model.getElementContratc()).thenReturn(elementContract);
        when(elementContract.getElementContract()).thenReturn("elemento");

        PeticionMothAssign monthAssign = mock(PeticionMothAssign.class);
        when(model.getMonthAssign()).thenReturn(monthAssign);
        when(monthAssign.getMothAssign()).thenReturn(6);

        PeticionMode mode = mock(PeticionMode.class);
        when(model.getMode()).thenReturn(mode);
        when(mode.getMode()).thenReturn("remoto");

        PeticionDefinitivePlace definitivePlace = mock(PeticionDefinitivePlace.class);
        when(model.getDefinitivePlace()).thenReturn(definitivePlace);
        when(definitivePlace.getDefinitivePlace()).thenReturn("CDMX");

        PeticionTypeAssign typeAssign = mock(PeticionTypeAssign.class);
        when(model.getTypeAssign()).thenReturn(typeAssign);
        when(typeAssign.getTypeAssign()).thenReturn("asignación");

        PeticionCareerPlan careerPlan = mock(PeticionCareerPlan.class);
        when(model.getCareerPlan()).thenReturn(careerPlan);
        when(careerPlan.getCareerPlan()).thenReturn("sí");

        PeticionDevelopmentRole developmentRole = mock(PeticionDevelopmentRole.class);
        when(model.getDevelopmentRole()).thenReturn(developmentRole);
        when(developmentRole.getDevelopmentRole()).thenReturn("backend");

        PeticionTalentPerfomance talentPerformance = mock(PeticionTalentPerfomance.class);
        when(model.getTalentPerformance()).thenReturn(talentPerformance);
        when(talentPerformance.getTalentPerformance()).thenReturn("evaluado");

        PeticionRate rate = mock(PeticionRate.class);
        when(model.getRate()).thenReturn(rate);
        when(rate.getRate()).thenReturn(1000.0);

        PeticionRateCap rateCap = mock(PeticionRateCap.class);
        when(model.getRateCap()).thenReturn(rateCap);
        when(rateCap.getRateCap()).thenReturn(1200.0);

        PeticionProjectType projectType = mock(PeticionProjectType.class);
        when(model.getProjectType()).thenReturn(projectType);
        when(projectType.getProjectType()).thenReturn("desarrollo");

        PeticionBudgetedMargin budgetedMargin = mock(PeticionBudgetedMargin.class);
        when(model.getBudgetedMargin()).thenReturn(budgetedMargin);
        when(budgetedMargin.getBudgetedMargin()).thenReturn(new BigDecimal("15.5"));

        PeticionAccumulatedMargin accumulatedMargin = mock(PeticionAccumulatedMargin.class);
        when(model.getAccumulatedMargin()).thenReturn(accumulatedMargin);
        when(accumulatedMargin.getAccumulatedMargin()).thenReturn(new BigDecimal("10.0"));

        PeticionRecoveryPlan recoveryPlan = mock(PeticionRecoveryPlan.class);
        when(model.getRecoveryPlan()).thenReturn(recoveryPlan);
        when(recoveryPlan.getRecoveryPlan()).thenReturn("plan A");

        PeticionGeneralComments generalComments = mock(PeticionGeneralComments.class);
        when(model.getGeneralComments()).thenReturn(generalComments);
        when(generalComments.getGeneralComments()).thenReturn("comentarios");

        PeticionProfile profile = mock(PeticionProfile.class);
        when(model.getProfile()).thenReturn(profile);
        when(profile.getProfile()).thenReturn("senior");

        PeticionLevel level = mock(PeticionLevel.class);
        when(model.getLevel()).thenReturn(level);
        when(level.getLevel()).thenReturn("nivel 3");

        PeticionTechnicalKnowledge technicalKnowledge = mock(PeticionTechnicalKnowledge.class);
        when(model.getTechnicalKnowledge()).thenReturn(technicalKnowledge);
        when(technicalKnowledge.getTechnicalKnowledge()).thenReturn("Java, Spring");

        PeticionFunctionalKnowledge functionalKnowledge = mock(PeticionFunctionalKnowledge.class);
        when(model.getFunctionalKnowledge()).thenReturn(functionalKnowledge);
        when(functionalKnowledge.getFunctionalKnowledge()).thenReturn("Finanzas");


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