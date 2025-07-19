package mx.com.santander.hexagonalmodularmaven.user.adapter.mapper;

import org.springframework.stereotype.Component;

import mx.com.santander.hexagonalmodularmaven.user.adapter.entity.UserEntity;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;

@Component
public class UserMapper {
	
	public User EntityToDom(UserEntity entity) {
		return new User(
				entity.getId(),
				entity.getUsername(),
				entity.getPassword()
				);
	}
    
}
