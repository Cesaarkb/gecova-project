package mx.com.santander.hexagonalmodularmaven.user.mapper;


import mx.com.santander.hexagonalmodularmaven.user.adapter.entity.UserEntity;
import mx.com.santander.hexagonalmodularmaven.user.adapter.mapper.UserMapper;
import mx.com.santander.hexagonalmodularmaven.user.model.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserMapperTest {

    @Test
    void testEntityToDom(){

        UserEntity entity = new UserEntity(1L,"rhvaldiviezo","contrasena-rommel");
        UserMapper mapper = new UserMapper();

        User user = mapper.EntityToDom(entity);
        assertNotNull(user);
        assertEquals(entity.getId(),user.getId());
        assertEquals(entity.getUsername(),user.getUsername());
        assertEquals(entity.getPassword(),user.getPassword());
    }
}
