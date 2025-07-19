package mx.com.santander.hexagonalmodularmaven.user.adapter.security.hash;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.user.port.security.UserHashedPassword;

@RequiredArgsConstructor
public class UserPasswordEncoderAdapter implements UserHashedPassword {
	
	private final PasswordEncoder passwordEncoder;


	@Override
	public boolean verify(String rawPassword, String hashedPassword) {
		return passwordEncoder.matches(rawPassword, hashedPassword);
	}

}
