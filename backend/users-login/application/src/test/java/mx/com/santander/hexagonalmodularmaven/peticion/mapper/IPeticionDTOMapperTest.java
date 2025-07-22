package mx.com.santander.hexagonalmodularmaven.peticion.mapper;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionAccumulatedMargin;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionApplicant;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionBudgetedMargin;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionCareerPlan;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionCompanyName;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionCustomer;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionDefinitivePlace;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionDevelopmentRole;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionElementContract;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionFunctionalKnowledge;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionGeneralComments;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionId;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionLevel;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionManagerName;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionMode;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionMothAssign;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionOrganizationUnit;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionPosition;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionPriority;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionProfile;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionProjectCode;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionProjectName;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionProjectType;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionRate;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionRateCap;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionRecoveryPlan;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionTalentPerfomance;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionTechnicalKnowledge;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionTypeAssign;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionTypeContract;

public class IPeticionDTOMapperTest {
    private final IPeticionDTOMapper mapper = Mappers.getMapper(IPeticionDTOMapper.class);

    
@Test
    void test_MapeoPeticionModelToDTO() {
        PeticionModel model = new PeticionModel();
        model.setId(new PeticionId(1L));
        model.setCustomer(new PeticionCustomer("customer"));
        model.setOrganizationUnit(new PeticionOrganizationUnit("organizacion"));
        model.setManagerName(new PeticionManagerName("manager"));
        model.setApplicant(new PeticionApplicant("aplicante"));
        model.setCompanyName(new PeticionCompanyName("compania"));
        model.setPriority(new PeticionPriority("prioridad"));
        model.setPosition(new PeticionPosition(1));
        model.setTypeContratc(new PeticionTypeContract("contrato"));
        model.setProjectCode(new PeticionProjectCode("codigo"));
        model.setProjectName(new PeticionProjectName("nombre"));
        model.setElementContratc(new PeticionElementContract("elementContract"));
        model.setMonthAssign(new PeticionMothAssign(1));
        model.setMode(new PeticionMode("mode"));
        model.setDefinitivePlace((new PeticionDefinitivePlace("definitivePlace")));
        model.setTypeAssign(new PeticionTypeAssign("typeAssign"));
        model.setCareerPlan(new PeticionCareerPlan("careerPlan"));
        model.setDevelopmentRole(new PeticionDevelopmentRole("developmentRole"));
        model.setTalentPerformance(new PeticionTalentPerfomance("talentPerformance"));
        model.setRate(new PeticionRate(12));
        model.setRateCap(new PeticionRateCap(12));
        model.setProjectType(new PeticionProjectType("projectType"));
        model.setBudgetedMargin(new PeticionBudgetedMargin(BigDecimal.valueOf(2)));
        model.setAccumulatedMargin(new PeticionAccumulatedMargin(BigDecimal.valueOf(2)));
        model.setRecoveryPlan(new PeticionRecoveryPlan("recoveryPlan"));
        model.setGeneralComments(new PeticionGeneralComments("generalComments"));
        model.setProfile(new PeticionProfile("profile"));
        model.setLevel(new PeticionLevel("level"));
        model.setTechnicalKnowledge(new PeticionTechnicalKnowledge("technicalKnowledge"));
        model.setFunctionalKnowledge(new PeticionFunctionalKnowledge("functionalKnowledge"));

        PeticionDTO dto = mapper.toDTO(model);
        
        assertNotNull(dto);
        assertEquals(model.getFunctionalKnowledge().getFunctionalKnowledge()
        ,dto.getFunctionalKnowledge());

    }


}
