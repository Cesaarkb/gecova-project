package mx.com.santender.hexagonalmodular.maven.user.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mx.com.santander.hexagonalmodularmaven.user.port.security.UserHashedPassword;
import mx.com.santander.hexagonalmodularmaven.user.service.UserValidatePasswordService;

@ExtendWith(MockitoExtension.class)
public class UserValidatePasswordServiceTest {
	
	private String rawPassword;
	private String hashedPassword;
	
	@BeforeEach
	void setUp() {
		rawPassword = "password123";
		hashedPassword = "$2a$abcdeaf";
	}

	@Mock
	private UserHashedPassword userHashedPassword;
	
	@InjectMocks
	private UserValidatePasswordService service;
	
	@Test
	void test_ContrasenaEnviadaIgualAContrasenaHasheada() {

		when(userHashedPassword.verify(rawPassword, hashedPassword)).thenReturn(true);
		
		boolean resultado = service.execute(rawPassword, hashedPassword);
		
		assertTrue(resultado);
		verify(userHashedPassword).verify(rawPassword, hashedPassword);
		
	}
	
	@Test
	void test_ContrasenaEnviadaDifenteAContrasenaHasheada() {
		when(userHashedPassword.verify(rawPassword, hashedPassword)).thenReturn(false);
		
		boolean resultado = service.execute(rawPassword, hashedPassword);
		
		assertFalse(resultado);
		verify(userHashedPassword).verify(rawPassword, hashedPassword);
	}
	
	
}
