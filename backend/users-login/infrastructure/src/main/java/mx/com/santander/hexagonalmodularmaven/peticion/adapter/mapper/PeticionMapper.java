package mx.com.santander.hexagonalmodularmaven.peticion.adapter.mapper;

import mx.com.santander.hexagonalmodularmaven.peticion.adapter.entity.PeticionEntity;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import org.springframework.stereotype.Component;

@Component
public class PeticionMapper {

    public PeticionModel toDomain(PeticionEntity e)
    {

        return new PeticionModel(

                e.getId(),
                e.getCliente(),
                e.getUnidadOrganizativa(),
                e.getNombreGestor(),
                e.getSolicitanteMercado(),
                e.getRazonSocial(),
                e.getPrioridad(),
                e.getPosiciones(),
                e.getTipoContratacion(),
                e.getCodigoProyecto(),
                e.getNombreProyecto(),
                e.getElementoParaContrataciones(),
                e.getMesesAsignacion(),
                e.getModalidad(),
                e.getLugarDefinitivo(),
                e.getTipoAsignacion(),
                e.getPlanCarrera(),
                e.getRolDesarrollo(),
                e.getEvaluadorPerformanceTalent(),
                e.getTasa(),
                e.getTasaTope(),
                e.getTipoProyecto(),
                e.getMargenPresupuestado(),
                e.getMargenAcumulado(),
                e.getPlanRecuperacion(),
                e.getComentariosGenerales(),
                e.getPerfil(),
                e.getNivel(),
                e.getConocimientosTecnicos(),
                e.getConocimientosFuncionales()
        );
    }

    public PeticionEntity toEntity(PeticionModel d) {
        var e = new PeticionEntity();

        e.setId(d.getId().getId());
        e.setCliente(d.getCustomer().getCustomer());
        e.setUnidadOrganizativa(d.getOrganizationUnit().getOrganizationUnit());
        e.setNombreGestor(d.getManagerName().getManagerName());
        e.setSolicitanteMercado(d.getApplicant().getApplicant());
        e.setRazonSocial(d.getCompanyName().getCompanyName());
        e.setPrioridad(d.getPriority().getPriority());
        e.setPosiciones(d.getPosition().getPosition());
        e.setTipoContratacion(d.getTypeContratc().getTypeContract());
        e.setCodigoProyecto(d.getProjectCode().getProjectCode());
        e.setNombreProyecto(d.getProjectName().getProjectName());
        e.setElementoParaContrataciones(d.getElementContratc().getElementContract());
        e.setMesesAsignacion(d.getMonthAssign().getMothAssign());
        e.setModalidad(d.getMode().getMode());
        e.setLugarDefinitivo(d.getDefinitivePlace().getDefinitivePlace());
        e.setTipoAsignacion(d.getTypeAssign().getTypeAssign());
        e.setPlanCarrera(d.getCareerPlan().getCareerPlan());
        e.setRolDesarrollo(d.getDevelopmentRole().getDevelopmentRole());
        e.setEvaluadorPerformanceTalent(d.getTalentPerformance().getTalentPerformance());
        e.setTasa(d.getRate().getRate());
        e.setTasaTope(d.getRateCap().getRateCap());
        e.setTipoProyecto(d.getProjectType().getProjectType());
        e.setMargenPresupuestado(d.getBudgetedMargin().getBudgetedMargin());
        e.setMargenAcumulado(d.getAccumulatedMargin().getAccumulatedMargin());
        e.setPlanRecuperacion(d.getRecoveryPlan().getRecoveryPlan());
        e.setComentariosGenerales(d.getGeneralComments().getGeneralComments());
        e.setPerfil(d.getProfile().getProfile());
        e.setNivel(d.getLevel().getLevel());
        e.setConocimientosTecnicos(d.getTechnicalKnowledge().getTechnicalKnowledge());
        e.setConocimientosFuncionales(d.getFunctionalKnowledge().getFunctionalKnowledge());

        return e;
    }
}
