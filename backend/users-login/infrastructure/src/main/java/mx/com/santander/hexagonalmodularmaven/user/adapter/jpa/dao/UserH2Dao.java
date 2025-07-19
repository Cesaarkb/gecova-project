package mx.com.santander.hexagonalmodularmaven.user.adapter.jpa.dao;

import mx.com.santander.hexagonalmodularmaven.user.adapter.entity.UserEntity;
import mx.com.santander.hexagonalmodularmaven.user.adapter.jpa.UserSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.user.adapter.mapper.UserMapper;
import mx.com.santander.hexagonalmodularmaven.user.exception.IncorrectCredentialsException;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import mx.com.santander.hexagonalmodularmaven.user.port.dao.UserDao;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserH2Dao implements UserDao {
	
	private final UserSpringJpaAdapterRepository userSpringJpaAdapterRepository;
	private final UserMapper userMapper;

	@Override
	public User findByUsername(String username) {
		UserEntity entity = userSpringJpaAdapterRepository.findByUsername(username)
				.orElseThrow(()-> new IncorrectCredentialsException());
		
			return userMapper.EntityToDom(entity);
		
	}

    

}
