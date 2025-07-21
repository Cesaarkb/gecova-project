package mx.com.santander.hexagonalmodularmaven.peticion.model.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PeticionDTO {

    private Long id;
    private String customer;
    private String organizationUnit;
    private String managerName;
    private String applicant;
    private String companyName;
    private String priority;
    private int position;
    private String typeContratc;
    private String projectCode;
    private String projectName;
    private String elementContratc;
    private int monthAssign;
    private String mode;
    private String definitivePlace;
    private String typeAssign;
    private String careerPlan;
    private String developmentRole;
    private String talentPerformance;
    private double rate;
    private double rateCap;
    private String projectType;
    private BigDecimal budgetedMargin;
    private BigDecimal accumulatedMargin;
    private String recoveryPlan;
    private String generalComments;
    private String profile;
    private String level;
    private String technicalKnowledge;
    private String functionalKnowledge;

}
