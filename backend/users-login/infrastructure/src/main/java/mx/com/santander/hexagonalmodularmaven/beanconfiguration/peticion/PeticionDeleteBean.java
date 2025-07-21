package mx.com.santander.hexagonalmodularmaven.beanconfiguration.peticion;

import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionDeleteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeticionDeleteBean {

    @Bean
    public PeticionDeleteService peticionDeleteService(IPeticionRepository repository){
        return new PeticionDeleteService(repository);
    }
}
