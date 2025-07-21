package mx.com.santander.hexagonalmodularmaven.peticion.model.entity;

import lombok.*;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.command.PeticionCreateCommand;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PeticionModel {

    private PeticionId id;
    private PeticionCustomer customer;
    private PeticionOrganizationUnit organizationUnit;
    private PeticionManagerName managerName;
    private PeticionApplicant applicant;
    private PeticionCompanyName companyName;
    private PeticionPriority priority;
    private PeticionPosition position;
    private PeticionTypeContract typeContratc;
    private PeticionProjectCode projectCode;
    private PeticionProjectName projectName;
    private PeticionElementContract elementContratc;
    private PeticionMothAssign monthAssign;
    private PeticionMode mode;
    private PeticionDefinitivePlace definitivePlace;
    private PeticionTypeAssign typeAssign;
    private PeticionCareerPlan careerPlan;
    private PeticionDevelopmentRole developmentRole;
    private PeticionTalentPerfomance talentPerformance;
    private PeticionRate rate;
    private PeticionRateCap rateCap;
    private PeticionProjectType projectType;
    private PeticionBudgetedMargin budgetedMargin;
    private PeticionAccumulatedMargin accumulatedMargin;
    private PeticionRecoveryPlan recoveryPlan;
    private PeticionGeneralComments generalComments;
    private PeticionProfile profile;
    private PeticionLevel level;
    private PeticionTechnicalKnowledge technicalKnowledge;
    private PeticionFunctionalKnowledge functionalKnowledge;

    public PeticionModel(
            Long id,
            String cliente,
            String unidadOrganizativa,
            String nombreGestor,
            String solicitanteMercado,
            String razonSocial,
            String prioridad,
            Integer posiciones,
            String tipoContratacion,
            String codigoProyecto,
            String nombreProyecto,
            String elementoParaContrataciones,
            Integer mesesAsignacion,
            String modalidad,
            String lugarDefinitivo,
            String tipoAsignacion,
            String planCarrera,
            String rolDesarrollo,
            String evaluadorPerformanceTalent,
            double tasa,
            Double tasaTope,
            String tipoProyecto,
            BigDecimal margenPresupuestado,
            BigDecimal margenAcumulado,
            String planRecuperacion,
            String comentariosGenerales,
            String perfil,
            String nivel,
            String conocimientosTecnicos,
            String conocimientosFuncionales
    ) {
        this.id = new PeticionId(id);
        this.customer = new PeticionCustomer(cliente);
        this.organizationUnit = new PeticionOrganizationUnit(unidadOrganizativa);
        this.managerName = new PeticionManagerName(nombreGestor);
        this.applicant = new PeticionApplicant(solicitanteMercado);
        this.companyName = new PeticionCompanyName(razonSocial);
        this.priority = new PeticionPriority(prioridad);
        this.position = new PeticionPosition(posiciones);
        this.typeContratc = new PeticionTypeContract(tipoContratacion);
        this.projectCode = new PeticionProjectCode(codigoProyecto);
        this.projectName = new PeticionProjectName(nombreProyecto);
        this.elementContratc = new PeticionElementContract(elementoParaContrataciones);
        this.monthAssign = new PeticionMothAssign(mesesAsignacion);
        this.mode = new PeticionMode(modalidad);
        this.definitivePlace = new PeticionDefinitivePlace(lugarDefinitivo);
        this.typeAssign = new PeticionTypeAssign(tipoAsignacion);
        this.careerPlan = new PeticionCareerPlan(planCarrera);
        this.developmentRole = new PeticionDevelopmentRole(rolDesarrollo);
        this.talentPerformance = new PeticionTalentPerfomance(evaluadorPerformanceTalent);
        this.rate = new PeticionRate(tasa);
        this.rateCap = new PeticionRateCap(tasaTope);
        this.projectType = new PeticionProjectType(tipoProyecto);
        this.budgetedMargin = new PeticionBudgetedMargin(margenPresupuestado);
        this.accumulatedMargin = new PeticionAccumulatedMargin(margenAcumulado);
        this.recoveryPlan = new PeticionRecoveryPlan(planRecuperacion);
        this.generalComments = new PeticionGeneralComments(comentariosGenerales);
        this.profile = new PeticionProfile(perfil);
        this.level = new PeticionLevel(nivel);
        this.technicalKnowledge = new PeticionTechnicalKnowledge(conocimientosTecnicos);
        this.functionalKnowledge = new PeticionFunctionalKnowledge(conocimientosFuncionales);
    }

    public PeticionModel requesToCreate(PeticionCreateCommand peticionCreateCommand){
        this.customer = new PeticionCustomer(peticionCreateCommand.getCustomer());
        this.organizationUnit = new PeticionOrganizationUnit(peticionCreateCommand.getOrganizationUnit());
        this.managerName = new PeticionManagerName(peticionCreateCommand.getManagerName());
        this.applicant=new PeticionApplicant(peticionCreateCommand.getApplicant());
        this.companyName = new PeticionCompanyName(peticionCreateCommand.getCompanyName());
        this.priority = new PeticionPriority(peticionCreateCommand.getPriority());
        this.position = new PeticionPosition(peticionCreateCommand.getPosition());
        this.typeContratc = new PeticionTypeContract(peticionCreateCommand.getTypeContratc());
        this.projectCode = new PeticionProjectCode(peticionCreateCommand.getProjectCode());
        this.projectName = new PeticionProjectName(peticionCreateCommand.getProjectName());
        this.elementContratc = new PeticionElementContract(peticionCreateCommand.getElementContratc());
        this.monthAssign = new PeticionMothAssign(peticionCreateCommand.getMonthAssign());
        this.mode = new PeticionMode(peticionCreateCommand.getMode());
        this.definitivePlace = new PeticionDefinitivePlace(peticionCreateCommand.getDefinitivePlace());
        this.typeAssign = new PeticionTypeAssign(peticionCreateCommand.getTypeAssign());
        this.careerPlan = new PeticionCareerPlan(peticionCreateCommand.getCareerPlan());
        this.developmentRole = new PeticionDevelopmentRole(peticionCreateCommand.getDevelopmentRole());
        this.talentPerformance = new PeticionTalentPerfomance(peticionCreateCommand.getTalentPerformance());
        this.rate = new PeticionRate(peticionCreateCommand.getRate());
        this.rateCap = new PeticionRateCap(peticionCreateCommand.getRateCap());
        this.projectType = new PeticionProjectType(peticionCreateCommand.getProjectType());
        this.budgetedMargin = new PeticionBudgetedMargin(peticionCreateCommand.getBudgetedMargin());
        this.accumulatedMargin = new PeticionAccumulatedMargin(peticionCreateCommand.getAccumulatedMargin());
        this.recoveryPlan = new PeticionRecoveryPlan(peticionCreateCommand.getRecoveryPlan());
        this.generalComments = new PeticionGeneralComments(peticionCreateCommand.getGeneralComments());
        this.profile = new PeticionProfile(peticionCreateCommand.getProfile());
        this.level = new PeticionLevel(peticionCreateCommand.getLevel());
        this.technicalKnowledge = new PeticionTechnicalKnowledge(peticionCreateCommand.getTechnicalKnowledge());
        this.functionalKnowledge = new PeticionFunctionalKnowledge(peticionCreateCommand.getFunctionalKnowledge());

        return this;
    }
}
