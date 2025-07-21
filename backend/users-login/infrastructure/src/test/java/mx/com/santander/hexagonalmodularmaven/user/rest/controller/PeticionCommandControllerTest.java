package mx.com.santander.hexagonalmodularmaven.user.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.command.PeticionCreateHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.command.PeticionDeleteHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.command.PeticionUpdateHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.command.PeticionCreateCommand;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.rest.controller.PeticionCommandController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class PeticionCommandControllerTest {

    private MockMvc mockMvc;
    private PeticionCreateHandler createHandler;
    private PeticionUpdateHandler updateHandler;
    private PeticionDeleteHandler deleteHandler;
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup() {
        createHandler = Mockito.mock(PeticionCreateHandler.class);
        updateHandler = Mockito.mock(PeticionUpdateHandler.class);
        deleteHandler = Mockito.mock(PeticionDeleteHandler.class);

        PeticionCommandController controller = new PeticionCommandController(createHandler, updateHandler, deleteHandler);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        objectMapper = new ObjectMapper();
    }

    @Test
    void createPeticion_returnsCreatedDTO() throws Exception {
        PeticionCreateCommand command = new PeticionCreateCommand();
        PeticionDTO dto = new PeticionDTO();

        when(createHandler.execute(any(PeticionCreateCommand.class))).thenReturn(dto);

        mockMvc.perform(post("/peticion")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(command)))
                .andExpect(status().isCreated())
                .andExpect(content().json(objectMapper.writeValueAsString(dto)));

        verify(createHandler).execute(any(PeticionCreateCommand.class));
    }

    @Test
    void updatePeticion_returnsUpdatedDTO() throws Exception {
        Long id = 1L;
        PeticionModel model = new PeticionModel();
        PeticionDTO dto = new PeticionDTO();

        when(updateHandler.execute(eq(id), any(PeticionModel.class))).thenReturn(dto);

        mockMvc.perform(put("/peticion/{id}", id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(model)))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(dto)));

        verify(updateHandler).execute(eq(id), any(PeticionModel.class));
    }

    @Test
    void deletePeticion_returnsNoContent() throws Exception {
        Long id = 2L;

        mockMvc.perform(delete("/peticion/{id}", id))
                .andExpect(status().isNoContent());

        verify(deleteHandler).execute(id);
    }

}