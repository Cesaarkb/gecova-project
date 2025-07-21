package mx.com.santander.hexagonalmodularmaven.peticion.command;

import mx.com.santander.hexagonalmodularmaven.peticion.mapper.IPeticionDTOMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.command.PeticionCreateCommand;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionCreateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class PeticionCreateHandlerTest {

    private IPeticionDTOMapper mapper;
    private PeticionCreateService service;
    private PeticionCreateHandler handler;

    @BeforeEach
    void setUp() {
        mapper = mock(IPeticionDTOMapper.class);
        service = mock(PeticionCreateService.class);
        handler = new PeticionCreateHandler(mapper, service);
    }

    @Test
    void shouldReturnPeticionDTO_whenExecuteIsCalled() {
        PeticionCreateCommand command = new PeticionCreateCommand();
        command.setCustomer("Cliente A");
        command.setOrganizationUnit("Unidad XYZ");
        command.setManagerName("Juan Pérez");
        command.setApplicant("Luis Gómez");
        command.setCompanyName("EmpresaTech");
        command.setPriority("Alta");
        command.setPosition(1);
        command.setTypeContratc("Indefinido");
        command.setProjectCode("PRJ-1234");
        command.setProjectName("Proyecto Interno");
        command.setElementContratc("Consultoría");
        command.setMonthAssign(6);
        command.setMode("Remoto");
        command.setDefinitivePlace("CDMX");
        command.setTypeAssign("Temporal");
        command.setCareerPlan("Plan B");
        command.setDevelopmentRole("Backend Developer");
        command.setTalentPerformance("Excelente");
        command.setRate(500.0);
        command.setRateCap(700.0);
        command.setProjectType("Interno");
        command.setBudgetedMargin(new BigDecimal("12000.50"));
        command.setAccumulatedMargin(new BigDecimal("3000.75"));
        command.setRecoveryPlan("Revisión trimestral");
        command.setGeneralComments("Sin observaciones");
        command.setProfile("Sr Java Developer");
        command.setLevel("Senior");
        command.setTechnicalKnowledge("Java, Spring, Docker");
        command.setFunctionalKnowledge("Finanzas, Banca");
        PeticionModel peticion = new PeticionModel().requesToCreate(command);

        PeticionDTO dtoEsperado = new PeticionDTO();
        dtoEsperado.setCustomer("Cliente A");
        dtoEsperado.setOrganizationUnit("Unidad XYZ");
        dtoEsperado.setManagerName("Juan Pérez");
        dtoEsperado.setApplicant("Luis Gómez");
        dtoEsperado.setCompanyName("EmpresaTech");
        dtoEsperado.setPriority("Alta");
        dtoEsperado.setPosition(1);
        dtoEsperado.setTypeContratc("Indefinido");
        dtoEsperado.setProjectCode("PRJ-1234");
        dtoEsperado.setProjectName("Proyecto Interno");
        dtoEsperado.setElementContratc("Consultoría");
        dtoEsperado.setMonthAssign(6);
        dtoEsperado.setMode("Remoto");
        dtoEsperado.setDefinitivePlace("CDMX");
        dtoEsperado.setTypeAssign("Temporal");
        dtoEsperado.setCareerPlan("Plan B");
        dtoEsperado.setDevelopmentRole("Backend Developer");
        dtoEsperado.setTalentPerformance("Excelente");
        dtoEsperado.setRate(500.0);
        dtoEsperado.setRateCap(700.0);
        dtoEsperado.setProjectType("Interno");
        dtoEsperado.setBudgetedMargin(new BigDecimal("12000.50"));
        dtoEsperado.setAccumulatedMargin(new BigDecimal("3000.75"));
        dtoEsperado.setRecoveryPlan("Revisión trimestral");
        dtoEsperado.setGeneralComments("Sin observaciones");
        dtoEsperado.setProfile("Sr Java Developer");
        dtoEsperado.setLevel("Senior");
        dtoEsperado.setTechnicalKnowledge("Java, Spring, Docker");
        dtoEsperado.setFunctionalKnowledge("Finanzas, Banca");

        when(service.execute(command)).thenReturn(peticion);
        when(mapper.toDTO(peticion)).thenReturn(dtoEsperado);

        PeticionDTO resultado = handler.execute(command);

        assertNotNull(resultado);
        assertEquals(dtoEsperado, resultado);

        verify(service).execute(command);
        verify(mapper).toDTO(peticion);
    }

}