package mx.com.santander.hexagonalmodularmaven.user.rest.controller;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.santander.hexagonalmodularmaven.user.query.UserAuthenticationHandler;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGenerateTokenService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGetByUsernameService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserValidatePasswordService;

@Configuration
public class TestConfig {

    @Bean
    public UserGenerateTokenService userGenerateTokenService() {
        return Mockito.mock(UserGenerateTokenService.class);
    }

    @Bean
    public UserGetByUsernameService userGetByUsernameService() {
        return Mockito.mock(UserGetByUsernameService.class);
    }

    @Bean
    public UserValidatePasswordService userValidatePasswordService() {
        return Mockito.mock(UserValidatePasswordService.class);
    }

    @Bean
    public UserAuthenticationHandler userAuthenticationHandler(
            UserGenerateTokenService tokenService,
            UserGetByUsernameService getUserService,
            UserValidatePasswordService validatePasswordService) {
        return new UserAuthenticationHandler(tokenService, getUserService, validatePasswordService);
    }

}
