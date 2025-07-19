package mx.com.santander.hexagonalmodularmaven.user.port.dao;


import java.util.Optional;

import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;

public interface UserDao {

    User findByUsername(String username);
}
