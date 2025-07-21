package mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix="security.jwt")
@Getter
@Setter
public class JwtProperties {
	
	private String secretKey;
	private long expirationMS;

}
