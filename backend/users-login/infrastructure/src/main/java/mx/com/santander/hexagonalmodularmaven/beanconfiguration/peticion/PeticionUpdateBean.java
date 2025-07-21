package mx.com.santander.hexagonalmodularmaven.beanconfiguration.peticion;

import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionUpdateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeticionUpdateBean {

    @Bean
    public PeticionUpdateService peticionUpdateService(IPeticionRepository repository){
        return new PeticionUpdateService(repository);
    }
}
