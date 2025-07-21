package mx.com.santander.hexagonalmodularmaven.user.adapter.jpa.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mx.com.santander.hexagonalmodularmaven.user.adapter.entity.UserEntity;
import mx.com.santander.hexagonalmodularmaven.user.adapter.jpa.UserSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.user.adapter.jpa.dao.UserH2Dao;
import mx.com.santander.hexagonalmodularmaven.user.adapter.mapper.UserMapper;
import mx.com.santander.hexagonalmodularmaven.user.exception.IncorrectCredentialsException;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;

@ExtendWith(MockitoExtension.class)
public class UserH2DaoTest {
	
	@Mock
	private  UserSpringJpaAdapterRepository repository;
	
	@Mock
	private UserMapper userMapper;
	
	@InjectMocks
	private UserH2Dao dao;
	
	@Test
	void test_BusquedaUsuarioPorUsernameExiste() {
		String username = "usuario";
		UserEntity entity = new UserEntity(1L, "usuario", "contrasena");
		User domain = new User(1L, "usuario", "contrasena");
		
		when(repository.findByUsername(username)).thenReturn(Optional.of(entity));
		when(userMapper.EntityToDom(entity)).thenReturn(domain);
		
		User resultado = dao.findByUsername(username);
		
		assertEquals(domain, resultado);
		
		
	}
	
	@Test
	void test_BusquedaUsuarioPorUsernameNoExiste() {
		String username = "usuarioNoExiste";
		when(repository.findByUsername(username)).thenReturn(Optional.empty());
		
		assertThrows(IncorrectCredentialsException.class, ()->{
			dao.findByUsername(username);
		});
	}

}
