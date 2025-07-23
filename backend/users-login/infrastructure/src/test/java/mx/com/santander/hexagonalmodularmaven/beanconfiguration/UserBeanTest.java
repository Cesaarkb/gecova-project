package mx.com.santander.hexagonalmodularmaven.beanconfiguration;

import mx.com.santander.hexagonalmodularmaven.user.adapter.security.hash.UserPasswordEncoderAdapter;
import mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator.JwtProperties;
import mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator.JwtTokenGenerator;
import mx.com.santander.hexagonalmodularmaven.user.port.dao.UserDao;
import mx.com.santander.hexagonalmodularmaven.user.port.security.TokenProvider;
import mx.com.santander.hexagonalmodularmaven.user.port.security.UserHashedPassword;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGenerateTokenService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGetByUsernameService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserValidatePasswordService;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.bson.assertions.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

public class UserBeanTest {

    @Test
    void tesJwtTokenGeneratorBean(){
        JwtProperties jwtProperties = mock(JwtProperties.class);
        UserBean userBean = new UserBean();
        JwtTokenGenerator jwtTokenGenerator = userBean.jwtTokenGenerator(jwtProperties);

        assertNotNull(jwtProperties);
    }

    @Test
    void testUserGenerateTokenService(){
        TokenProvider tokenProvider = mock(TokenProvider.class);
        UserBean userBean = new UserBean();
        UserGenerateTokenService userGenerateTokenService = userBean.userGenerateTokenService(tokenProvider);
        assertNotNull(tokenProvider);
    }

    @Test
    void testUserGetByUsernameService(){

        UserDao userDao = mock(UserDao.class);
        UserBean userBean = new UserBean();
        UserGetByUsernameService userGetByUsernameService = userBean.userGetByUsernameService(userDao);

        assertNotNull(userGetByUsernameService);
    }
    @Test
    void testUserValidatePasswordService(){
        UserHashedPassword userHashedPassword = mock(UserHashedPassword.class);
        UserBean userBean = new UserBean();
        UserValidatePasswordService passwordService = userBean.userValidatePasswordService(userHashedPassword);

    }

    @Test
    void testPasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = mock(BCryptPasswordEncoder.class);
        UserBean userBean = new UserBean();
        PasswordEncoder passwordEncoder = userBean.passwordEncoder();


    }

    @Test
    void testUserPasswordEncoderAdapter(){
        PasswordEncoder passwordEncoder = mock(PasswordEncoder.class);
        UserBean userBean = new UserBean();
        UserPasswordEncoderAdapter userPasswordEncoderAdapter = userBean.userPasswordEncoderAdapter(passwordEncoder);

    }
}
