package mx.com.santander.hexagonalmodularmaven.user.service;

import java.util.Optional;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import mx.com.santander.hexagonalmodularmaven.user.port.dao.UserDao;

/** 
 * Clase implementadora (Service) de UserDao para busqueda de User por Username en BD.
 */

@RequiredArgsConstructor
public class UserGetByUsernameService {
	
	private final UserDao userDao;
	
	/**
	 * Implementación método findByUsername de UserDao.
	 * @param username nombre de usuario a buscar
	 * @return retorna un Optional de User
	 */
	
	public User execute(String username) {
		return userDao.findByUsername(username);
	}


}
