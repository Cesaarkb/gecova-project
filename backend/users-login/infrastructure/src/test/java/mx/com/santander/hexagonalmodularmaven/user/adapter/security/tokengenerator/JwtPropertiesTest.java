package mx.com.santander.hexagonalmodularmaven.user.adapter.security.tokengenerator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JwtPropertiesTest {

    @Test
    void testJwtPropertiesSetterGetter() {
        JwtProperties props = new JwtProperties();
        props.setSecretKey("clave-super-secreta");
        props.setExpirationMS(3600000L);

        assertEquals("clave-super-secreta", props.getSecretKey());
        assertEquals(3600000L, props.getExpirationMS());
    }
/*
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withUserConfiguration(TestConfiguration.class)
            .withPropertyValues(
                    "security.jwt.secret-key=clave-secreta-proyecto",
                    "security.jwt.expiration-ms=3600000"
            );

            @Test
    void proporcionPropiedadesJwt() {
                contextRunner.run(context -> {
                    JwtProperties props = context.getBean(JwtProperties.class);
                    assertThat(props.getSecretKey()).isEqualTo("clave-secreta-proyecto");
                    assertThat(props.getExpirationMS()).isEqualTo(3600000);
                });
            }
    @EnableConfigurationProperties(JwtProperties.class)
    static class TestConfig {}

 */
}
