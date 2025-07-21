package mx.com.santander.hexagonalmodularmaven.user.rest.controller;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackageClasses = UserCommandController.class)
public class DummyAppConfig {

}
