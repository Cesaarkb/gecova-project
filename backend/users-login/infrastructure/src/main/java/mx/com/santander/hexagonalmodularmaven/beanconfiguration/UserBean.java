package mx.com.santander.hexagonalmodularmaven.beanconfiguration;

import mx.com.santander.hexagonalmodularmaven.user.adapter.security.hash.UserPasswordEncoderAdapter;
import mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator.JwtProperties;
import mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator.JwtTokenGenerator;
import mx.com.santander.hexagonalmodularmaven.user.port.dao.UserDao;
import mx.com.santander.hexagonalmodularmaven.user.port.security.UserHashedPassword;
import mx.com.santander.hexagonalmodularmaven.user.port.security.TokenProvider;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGenerateTokenService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserGetByUsernameService;
import mx.com.santander.hexagonalmodularmaven.user.service.UserValidatePasswordService;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(JwtProperties.class)
public class UserBean {
	
	
	@Bean
	public JwtTokenGenerator jwtTokenGenerator(JwtProperties jwtProperties) {
	        return new JwtTokenGenerator(jwtProperties);
	    }
	
    @Bean
    public UserGenerateTokenService userGenerateTokenService(TokenProvider tokenProvider){
        return new UserGenerateTokenService(tokenProvider);
    }
    
    @Bean
    public UserGetByUsernameService userGetByUsernameService(UserDao userDao) {
    	return new UserGetByUsernameService(userDao);
    }
    
    @Bean	
    public UserValidatePasswordService userValidatePasswordService(UserHashedPassword passwordEncoder) {
    	return new UserValidatePasswordService(passwordEncoder);
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public UserPasswordEncoderAdapter userPasswordEncoderAdapter(PasswordEncoder passwordEncoder) {
    	return new UserPasswordEncoderAdapter(passwordEncoder);
    }
    
    
    

}
