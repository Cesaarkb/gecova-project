package mx.com.santander.hexagonalmodularmaven.beanconfiguration.peticion;


import mx.com.santander.hexagonalmodularmaven.peticion.port.dao.IPeticionDAO;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionAllService;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionByIdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeticionDAOBean {

    @Bean
    public PeticionAllService peticionAllService(IPeticionDAO peticionDAO){
        return new PeticionAllService(peticionDAO);
    }

    @Bean
    public PeticionByIdService peticionByIdService(IPeticionDAO peticionDAO){
        return new PeticionByIdService(peticionDAO);
    }
}
