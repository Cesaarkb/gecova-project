package mx.com.santander.hexagonalmodularmaven.peticion.peticion;

import mx.com.santander.hexagonalmodularmaven.beanconfiguration.peticion.PeticionDAOBean;
import mx.com.santander.hexagonalmodularmaven.peticion.port.dao.IPeticionDAO;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionAllService;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionByIdService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

class PeticionDAOBeanTest {

    @Test
    void shouldCreateBeansWithInjectedDAO() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(PeticionDAOBean.class);

            IPeticionDAO mockDAO = mock(IPeticionDAO.class);
            context.registerBean(IPeticionDAO.class, () -> mockDAO);

            context.refresh();

            PeticionAllService allService = context.getBean(PeticionAllService.class);
            PeticionByIdService byIdService = context.getBean(PeticionByIdService.class);

            assertNotNull(allService);
            assertNotNull(byIdService);
        }
    }

}