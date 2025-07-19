package mx.com.santander.hexagonalmodularmaven.user.rest.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.com.santander.hexagonalmodularmaven.user.exception.IncorrectCredentialsException;
import mx.com.santander.hexagonalmodularmaven.user.query.UserAuthenticationHandler;
import mx.com.santander.hexagonalmodularmaven.user.rest.advice.UserControllerAdvice;
import mx.com.santander.hexagonalmodularmaven.user.rest.controller.dto.UserLoginRequest;

@WebMvcTest(controllers = UserCommandController.class)
@Import({UserControllerAdvice.class, DummyAppConfig.class})
public class UserCommandControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserAuthenticationHandler userAuthenticationHandler;
    
    @Autowired
    private ObjectMapper objectMapper;


    @Test
    void testLogin_CuandoDatosValidosRetornaToken() throws Exception {
        String tokenEsperado = "token123";
        UserLoginRequest request = new UserLoginRequest("usuario", "password");

        when(userAuthenticationHandler.execute(request.getUsername(), request.getPassword()))
                .thenReturn(tokenEsperado);

        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token").value(tokenEsperado));
    }

    @Test
    void testLogin_CuandoCredencialesIncorrectas_RetornaBadRequest() throws Exception {
        UserLoginRequest request = new UserLoginRequest("usuario", "password");

        when(userAuthenticationHandler.execute(request.getUsername(), request.getPassword()))
                .thenThrow(new IncorrectCredentialsException());

        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Las credenciales ingresadas no son correctas"));
    }

    @Test
    void testLogin_CuandoFaltanCampos_RetornaErroresValidacion() throws Exception {
        UserLoginRequest request = new UserLoginRequest("", "");

        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.username").value("debes ingresar un username"))
                .andExpect(jsonPath("$.password").value("Debes ingresar una contraseña"));
    }

}
