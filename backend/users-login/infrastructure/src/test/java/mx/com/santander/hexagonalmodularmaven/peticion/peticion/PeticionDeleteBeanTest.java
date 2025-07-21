package mx.com.santander.hexagonalmodularmaven.peticion.peticion;

import mx.com.santander.hexagonalmodularmaven.beanconfiguration.peticion.PeticionDeleteBean;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionDeleteService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

class PeticionDeleteBeanTest {

    @Test
    void shouldCreatePeticionDeleteServiceBean() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(PeticionDeleteBean.class);

            IPeticionRepository mockRepository = mock(IPeticionRepository.class);
            context.registerBean(IPeticionRepository.class, () -> mockRepository);

            context.refresh();

            PeticionDeleteService deleteService = context.getBean(PeticionDeleteService.class);
            assertNotNull(deleteService);

        }
    }

}