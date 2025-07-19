package mx.com.santender.hexagonalmodular.maven.user.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import mx.com.santander.hexagonalmodularmaven.user.port.dao.UserDao;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGetByUsernameService;

@ExtendWith(MockitoExtension.class)
public class UserGetByUsernameServiceTest {

@Mock
private UserDao userDao;

@InjectMocks
private UserGetByUsernameService service;

@Test
void test_ObtenerUsuarioPorUsername() {
	User user = new User(1L, "usuario", "password");
	
	when(userDao.findByUsername("usuario")).thenReturn(user);
	
	User esperado = service.execute("usuario");
	
	assertEquals("usuario", esperado.getUsername());
	verify(userDao).findByUsername("usuario");
}
	
}
