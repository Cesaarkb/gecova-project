package mx.com.santander.hexagonalmodularmaven.beanconfiguration.peticion;

import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionCreateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeticionCreateBean {

    @Bean
    public PeticionCreateService peticionCreateService(IPeticionRepository repository){
        return new PeticionCreateService(repository);
    }
}
