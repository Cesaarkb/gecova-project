package mx.com.santander.hexagonalmodularmaven.user.adapter.security.hash;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import mx.com.santander.hexagonalmodularmaven.user.adapter.security.hash.UserPasswordEncoderAdapter;

@ExtendWith(MockitoExtension.class)
public class UserPasswordEncoderAdapterTest {

	@Mock
	private PasswordEncoder passwordEncoder;
	
	@InjectMocks
	private UserPasswordEncoderAdapter encoderAdapter;
	
	@Test
	void test_ContrasenaEnviadaYEnBaseDatosIguales() {
		String contrasenaEnviada = "123abc456";
		String contrasenaEnBD = "123abc456";
		
		when(passwordEncoder.matches(contrasenaEnviada, contrasenaEnBD)).thenReturn(true);
		
		boolean respuesta = encoderAdapter.verify(contrasenaEnviada, contrasenaEnBD);
		
		assertTrue(respuesta);
	}
	
	@Test
	void test_ContrasenaEnviadaYEnBaseDatosDiferentes() {
		String contrasenaEnviada = "123abc456";
		String contrasenaEnBD = "456abc123";
		
		when(passwordEncoder.matches(contrasenaEnviada, contrasenaEnBD)).thenReturn(false);
		
		boolean respuesta = encoderAdapter.verify(contrasenaEnviada, contrasenaEnBD);
		
		assertFalse(respuesta);
	}
	
	
}
