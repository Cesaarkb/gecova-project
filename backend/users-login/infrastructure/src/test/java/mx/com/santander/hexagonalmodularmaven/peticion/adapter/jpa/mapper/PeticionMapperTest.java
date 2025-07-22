package mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.mapper;

import mx.com.santander.hexagonalmodularmaven.peticion.adapter.entity.PeticionEntity;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.mapper.PeticionMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeticionMapperTest {

    private final PeticionMapper mapper = new
            PeticionMapper();
    @Test
    void testToDomain() {
        PeticionEntity entity = new PeticionEntity();
        entity.setId(1L);
        entity.setCliente("Cliente X");
        entity.setUnidadOrganizativa("Unidad Y");
        entity.setNombreGestor("Gestor Z");
        entity.setSolicitanteMercado("Solicitante A");
        entity.setRazonSocial("Empresa B");
        entity.setPrioridad("Alta");
        entity.setPosiciones(2);
        entity.setTipoContratacion("Temporal");
        entity.setCodigoProyecto("PRJ001");
        entity.setNombreProyecto("Proyecto Uno");
        entity.setElementoParaContrataciones("Elemento X");
        entity.setMesesAsignacion(2);
        entity.setModalidad("Remoto");
        entity.setLugarDefinitivo("Oficina Central");
        entity.setTipoAsignacion("Full-time");
        entity.setPlanCarrera("Plan A");
        entity.setRolDesarrollo("Desarrollador");
        entity.setEvaluadorPerformanceTalent("Evaluador 1");
        entity.setTasa(2);
        entity.setTasaTope(2.3);
        entity.setTipoProyecto("Interno");
        entity.setMargenPresupuestado(BigDecimal.valueOf(23));
        entity.setMargenAcumulado(BigDecimal.valueOf(23));
        entity.setPlanRecuperacion("Plan B");
        entity.setComentariosGenerales("Sin comentarios");
        entity.setPerfil("Senior");
        entity.setNivel("Nivel 3");
        entity.setConocimientosTecnicos("Java, Spring");
        entity.setConocimientosFuncionales("Contabilidad");

        PeticionModel model = mapper.toDomain(entity);
        assertEquals(entity.getCliente(), model.getCustomer().getCustomer());
        assertEquals(entity.getUnidadOrganizativa(), model.getOrganizationUnit().getOrganizationUnit());
        assertEquals(entity.getNombreGestor(), model.getManagerName().getManagerName());
        assertEquals(entity.getSolicitanteMercado(), model.getApplicant().getApplicant());
        assertEquals(entity.getRazonSocial(), model.getCompanyName().getCompanyName());
        assertEquals(entity.getPrioridad(), model.getPriority().getPriority());
        assertEquals(entity.getPosiciones(), model.getPosition().getPosition());
        assertEquals(entity.getTipoContratacion(), model.getTypeContratc().getTypeContract());
        assertEquals(entity.getCodigoProyecto(), model.getProjectCode().getProjectCode());
        assertEquals(entity.getNombreProyecto(), model.getProjectName().getProjectName());
        assertEquals(entity.getElementoParaContrataciones(), model.getElementContratc().getElementContract());
        assertEquals(entity.getMesesAsignacion(), model.getMonthAssign().getMothAssign());
        assertEquals(entity.getModalidad(), model.getMode().getMode());
        assertEquals(entity.getLugarDefinitivo(), model.getDefinitivePlace().getDefinitivePlace());
        assertEquals(entity.getTipoAsignacion(), model.getTypeAssign().getTypeAssign());
        assertEquals(entity.getPlanCarrera(), model.getCareerPlan().getCareerPlan());
        assertEquals(entity.getRolDesarrollo(), model.getDevelopmentRole().getDevelopmentRole());
        assertEquals(entity.getEvaluadorPerformanceTalent(), model.getTalentPerformance().getTalentPerformance());
        assertEquals(entity.getTasa(), model.getRate().getRate());
        assertEquals(entity.getTasaTope(), model.getRateCap().getRateCap());
        assertEquals(entity.getTipoProyecto(), model.getProjectType().getProjectType());
        assertEquals(entity.getMargenPresupuestado(), model.getBudgetedMargin().getBudgetedMargin());
        assertEquals(entity.getMargenAcumulado(), model.getAccumulatedMargin().getAccumulatedMargin());
        assertEquals(entity.getPlanRecuperacion(), model.getRecoveryPlan().getRecoveryPlan());
        assertEquals(entity.getComentariosGenerales(), model.getGeneralComments().getGeneralComments());
        assertEquals(entity.getPerfil(), model.getProfile().getProfile());
        assertEquals(entity.getNivel(), model.getLevel().getLevel());
        assertEquals(entity.getConocimientosTecnicos(), model.getTechnicalKnowledge().getTechnicalKnowledge());
        assertEquals(entity.getConocimientosFuncionales(), model.getFunctionalKnowledge().getFunctionalKnowledge());
    }

}
