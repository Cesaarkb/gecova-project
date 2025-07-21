package mx.com.santander.hexagonalmodularmaven.peticion.peticion;

import mx.com.santander.hexagonalmodularmaven.beanconfiguration.peticion.PeticionUpdateBean;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionUpdateService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

class PeticionUpdateBeanTest {

    @Test
    void shouldCreatePeticionUpdateServiceBean() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(PeticionUpdateBean.class);

            IPeticionRepository mockRepository = mock(IPeticionRepository.class);
            context.registerBean(IPeticionRepository.class, () -> mockRepository);

            context.refresh();

            PeticionUpdateService updateService = context.getBean(PeticionUpdateService.class);
            assertNotNull(updateService);

        }
    }

}