package mx.com.santander.hexagonalmodularmaven.peticion.peticion;

import mx.com.santander.hexagonalmodularmaven.beanconfiguration.peticion.PeticionCreateBean;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionCreateService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PeticionCreateBeanTest {

    @Test
    void shouldCreatePeticionCreateServiceBean() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(PeticionCreateBean.class);


            IPeticionRepository mockRepository = org.mockito.Mockito.mock(IPeticionRepository.class);

            context.registerBean(IPeticionRepository.class, () -> mockRepository);

            context.refresh();

            PeticionCreateService service = context.getBean(PeticionCreateService.class);
            assertNotNull(service);

        }
    }

}