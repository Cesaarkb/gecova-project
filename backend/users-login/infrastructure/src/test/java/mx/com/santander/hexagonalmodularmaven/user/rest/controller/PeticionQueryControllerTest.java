package mx.com.santander.hexagonalmodularmaven.user.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.query.PeticionAllHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.query.PeticionByIdHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.rest.controller.PeticionQueryController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



class PeticionQueryControllerTest {

    private MockMvc mockMvc;
    private PeticionAllHandler allHandler;
    private PeticionByIdHandler byIdHandler;
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup() {
        allHandler = Mockito.mock(PeticionAllHandler.class);
        byIdHandler = Mockito.mock(PeticionByIdHandler.class);

        PeticionQueryController controller = new PeticionQueryController(allHandler, byIdHandler);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        objectMapper = new ObjectMapper();
    }

    @Test
    void findAll_returnsListOfPeticionDTO() throws Exception {
        PeticionDTO dto1 = new PeticionDTO();
        PeticionDTO dto2 = new PeticionDTO();

        when(allHandler.execute()).thenReturn(List.of(dto1, dto2));

        mockMvc.perform(get("/peticion")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(List.of(dto1, dto2))));

        verify(allHandler).execute();
    }

    @Test
    void findById_returnsPeticionDTO() throws Exception {
        Long id = 1L;
        PeticionDTO dto = new PeticionDTO();

        when(byIdHandler.execute(anyLong())).thenReturn(dto);

        mockMvc.perform(get("/peticion/{id}", id)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(dto)));

        verify(byIdHandler).execute(id);
    }

}