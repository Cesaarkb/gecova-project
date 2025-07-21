package mx.com.santander.hexagonalmodularmaven.peticion.mapper;

import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.math.BigDecimal;


@Mapper(componentModel = "spring")
public interface IPeticionDTOMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "customer", target = "customer"),
            @Mapping(source = "organizationUnit", target = "organizationUnit"),
            @Mapping(source = "managerName", target = "managerName"),
            @Mapping(source = "applicant", target = "applicant"),
            @Mapping(source = "companyName", target = "companyName"),
            @Mapping(source = "priority", target = "priority"),
            @Mapping(source = "position", target = "position"),
            @Mapping(source = "typeContratc", target = "typeContratc"),
            @Mapping(source = "projectCode", target = "projectCode"),
            @Mapping(source = "projectName", target = "projectName"),
            @Mapping(source = "elementContratc", target = "elementContratc"),
            @Mapping(source = "monthAssign", target = "monthAssign"),
            @Mapping(source = "mode", target = "mode"),
            @Mapping(source = "definitivePlace", target = "definitivePlace"),
            @Mapping(source = "typeAssign", target = "typeAssign"),
            @Mapping(source = "careerPlan", target = "careerPlan"),
            @Mapping(source = "developmentRole", target = "developmentRole"),
            @Mapping(source = "talentPerformance", target = "talentPerformance"),
            @Mapping(source = "rate", target = "rate"),
            @Mapping(source = "rateCap", target = "rateCap"),
            @Mapping(source = "projectType", target = "projectType"),
            @Mapping(source = "budgetedMargin", target = "budgetedMargin"),
            @Mapping(source = "accumulatedMargin", target = "accumulatedMargin"),
            @Mapping(source = "recoveryPlan", target = "recoveryPlan"),
            @Mapping(source = "generalComments", target = "generalComments"),
            @Mapping(source = "profile", target = "profile"),
            @Mapping(source = "level", target = "level"),
            @Mapping(source = "technicalKnowledge", target = "technicalKnowledge"),
            @Mapping(source = "functionalKnowledge", target = "functionalKnowledge")
    })
    PeticionDTO toDTO(PeticionModel domain);

    default Long map(PeticionId id) {
        return id != null ? id.getId() : null;
    }

    default String map(PeticionCustomer customer) {
        return customer != null ? customer.getCustomer() : null;
    }

    default String map(PeticionOrganizationUnit val) {
        return val != null ? val.getOrganizationUnit() : null;
    }

    default String map(PeticionManagerName val) {
        return val != null ? val.getManagerName() : null;
    }

    default String map(PeticionApplicant val) {
        return val != null ? val.getApplicant() : null;
    }

    default String map(PeticionCompanyName val) {
        return val != null ? val.getCompanyName() : null;
    }

    default String map(PeticionPriority val) {
        return val != null ? val.getPriority() : null;
    }

    default int map(PeticionPosition val) {
        return val != null ? val.getPosition() : 0;
    }

    default String map(PeticionTypeContract val) {
        return val != null ? val.getTypeContract() : null;
    }

    default String map(PeticionProjectCode val) {
        return val != null ? val.getProjectCode() : null;
    }

    default String map(PeticionProjectName val) {
        return val != null ? val.getProjectName() : null;
    }

    default String map(PeticionElementContract val) {
        return val != null ? val.getElementContract() : null;
    }

    default int map(PeticionMothAssign val) {
        return val != null ? val.getMothAssign() : 0;
    }

    default String map(PeticionMode val) {
        return val != null ? val.getMode() : null;
    }

    default String map(PeticionDefinitivePlace val) {
        return val != null ? val.getDefinitivePlace() : null;
    }

    default String map(PeticionTypeAssign val) {
        return val != null ? val.getTypeAssign() : null;
    }

    default String map(PeticionCareerPlan val) {
        return val != null ? val.getCareerPlan() : null;
    }

    default String map(PeticionDevelopmentRole val) {
        return val != null ? val.getDevelopmentRole() : null;
    }

    default String map(PeticionTalentPerfomance val) {
        return val != null ? val.getTalentPerformance() : null;
    }

    default double map(PeticionRate val) {
        return val != null ? val.getRate() : 0.0;
    }

    default double map(PeticionRateCap val) {
        return val != null ? val.getRateCap() : 0.0;
    }

    default String map(PeticionProjectType val) {
        return val != null ? val.getProjectType() : null;
    }

    default BigDecimal map(PeticionBudgetedMargin val) {
        return val != null ? val.getBudgetedMargin() : null;
    }

    default BigDecimal map(PeticionAccumulatedMargin val) {
        return val != null ? val.getAccumulatedMargin() : null;
    }

    default String map(PeticionRecoveryPlan val) {
        return val != null ? val.getRecoveryPlan() : null;
    }

    default String map(PeticionGeneralComments val) {
        return val != null ? val.getGeneralComments() : null;
    }

    default String map(PeticionProfile val) {
        return val != null ? val.getProfile() : null;
    }

    default String map(PeticionLevel val) {
        return val != null ? val.getLevel() : null;
    }

    default String map(PeticionTechnicalKnowledge val) {
        return val != null ? val.getTechnicalKnowledge() : null;
    }

    default String map(PeticionFunctionalKnowledge val) {
        return val != null ? val.getFunctionalKnowledge() : null;
    }
}