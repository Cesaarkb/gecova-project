package mx.com.santander.hexagonalmodularmaven.user.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mx.com.santander.hexagonalmodularmaven.user.exception.IncorrectCredentialsException;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGenerateTokenService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGetByUsernameService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserValidatePasswordService;

@ExtendWith(MockitoExtension.class)
public class UserAuthenticationHandlerTest {

	@Mock
	private UserGenerateTokenService userGenerateTokenService;
	
	@Mock
	private UserGetByUsernameService userGetByUsernameService;
	
	@Mock
	UserValidatePasswordService userValidatePasswordService;
	
	
	@InjectMocks
	UserAuthenticationHandler handler;
	
	@Test
	void test_GeneracionTokenCuandoUsuarioExistaYPasswordSeaCorrecta() {
		User user = new User(1L, "usuario", "2$a$123abc");
		String usernameSend = "usuario";
		String rawPasswordSend = "contrasena";
		String tokenReturn = "aaa.bbb.ccdd";
		when(userGetByUsernameService.execute(usernameSend)).thenReturn(user);
		when(userValidatePasswordService.execute(rawPasswordSend, user.getPassword()))
		.thenReturn(true);
		when(userGenerateTokenService.execute(user)).thenReturn(tokenReturn);
		
		
		String tokenEnviado = handler.execute(usernameSend, rawPasswordSend);
		
		assertEquals(tokenReturn, tokenEnviado);
		
		verify(userGetByUsernameService).execute(usernameSend);
		verify(userValidatePasswordService).execute(rawPasswordSend, user.getPassword());
		verify(userGenerateTokenService).execute(user);
	}
	
	void test_LanzaExcepcionCuandoContrasenaEsIncorrecta() {
		User user = new User(1L, "usuario", "2$a$123abc");
		String usernameSend = "usuario";
		String rawPasswordSend = "contrasenaIncorrecta";
		
		when(userGetByUsernameService.execute(usernameSend)).thenReturn(user);
		when(userValidatePasswordService.execute(rawPasswordSend, user.getPassword()))
		.thenReturn(false);
		
		assertThrows(IncorrectCredentialsException.class, ()->{
			handler.execute(usernameSend, rawPasswordSend);
		});
		
		  verify(userGetByUsernameService).execute(usernameSend);
		    verify(userValidatePasswordService).execute(rawPasswordSend, user.getPassword());
		    verifyNoInteractions(userGenerateTokenService);
	}
	
}
