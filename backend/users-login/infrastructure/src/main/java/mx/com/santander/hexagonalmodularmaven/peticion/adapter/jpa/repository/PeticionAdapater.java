package mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.repository;


import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.entity.PeticionEntity;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.IPeticionAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.mapper.PeticionMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionNotFoundException;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PeticionAdapater implements IPeticionRepository {

    private final IPeticionAdapterRepository repository;
    private final PeticionMapper mapper;

    @Override
    public PeticionModel create(PeticionModel peticion) {
        return mapper.toDomain(repository.save(mapper.toEntity(peticion)));
    }

    @Override
    public PeticionModel update(Long id, PeticionModel peticion) {
        PeticionEntity peticionTraida = repository.findById(id).orElseThrow(()->new PeticionNotFoundException("Peticon no encontrado"));

        peticionTraida.setCliente(peticion.getCustomer().getCustomer());
        peticionTraida.setUnidadOrganizativa(peticion.getOrganizationUnit().getOrganizationUnit());
        peticionTraida.setNombreGestor(peticion.getManagerName().getManagerName());
        peticionTraida.setSolicitanteMercado(peticion.getApplicant().getApplicant());
        peticionTraida.setRazonSocial(peticion.getCompanyName().getCompanyName());
        peticionTraida.setPrioridad(peticion.getPriority().getPriority());
        peticionTraida.setPosiciones(peticion.getPosition().getPosition());
        peticionTraida.setTipoContratacion(peticion.getTypeContratc().getTypeContract());
        peticionTraida.setCodigoProyecto(peticion.getProjectCode().getProjectCode());
        peticionTraida.setNombreProyecto(peticion.getProjectName().getProjectName());
        peticionTraida.setElementoParaContrataciones(peticion.getElementContratc().getElementContract());
        peticionTraida.setMesesAsignacion(peticion.getMonthAssign().getMothAssign());
        peticionTraida.setModalidad(peticion.getMode().getMode());
        peticionTraida.setLugarDefinitivo(peticion.getDefinitivePlace().getDefinitivePlace());
        peticionTraida.setTipoAsignacion(peticion.getTypeAssign().getTypeAssign());
        peticionTraida.setPlanCarrera(peticion.getCareerPlan().getCareerPlan());
        peticionTraida.setRolDesarrollo(peticion.getDevelopmentRole().getDevelopmentRole());
        peticionTraida.setEvaluadorPerformanceTalent(peticion.getTalentPerformance().getTalentPerformance());
        peticionTraida.setTasa(peticion.getRate().getRate());
        peticionTraida.setTasaTope(peticion.getRateCap().getRateCap());
        peticionTraida.setTipoProyecto(peticion.getProjectType().getProjectType());
        peticionTraida.setMargenPresupuestado(peticion.getBudgetedMargin().getBudgetedMargin());
        peticionTraida.setMargenAcumulado(peticion.getAccumulatedMargin().getAccumulatedMargin());
        peticionTraida.setPlanRecuperacion(peticion.getRecoveryPlan().getRecoveryPlan());
        peticionTraida.setComentariosGenerales(peticion.getGeneralComments().getGeneralComments());
        peticionTraida.setPerfil(peticion.getProfile().getProfile());
        peticionTraida.setNivel(peticion.getLevel().getLevel());
        peticionTraida.setConocimientosTecnicos(peticion.getTechnicalKnowledge().getTechnicalKnowledge());
        peticionTraida.setConocimientosFuncionales(peticion.getFunctionalKnowledge().getFunctionalKnowledge());

        PeticionEntity updated = repository.save(peticionTraida);

        return mapper.toDomain(updated);
    }

    @Override
    public void delete(Long id) {
        PeticionEntity peticionTraida = repository.findById(id).orElseThrow(()->new PeticionNotFoundException("Peticon no encontrado"));
        repository.delete(peticionTraida);
    }
}
