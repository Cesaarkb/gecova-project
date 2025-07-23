package mx.com.santander.hexagonalmodularmaven.peticion.peticion;
import org.springframework.web.filter.CorsFilter;
import mx.com.santander.hexagonalmodularmaven.peticion.rest.advice.CorsGlobalConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
public class CorsGlobalConfigurationTest {

    private CorsGlobalConfiguration corsGlobalConfiguration;

    @BeforeEach
    void setUp() {
        corsGlobalConfiguration = new CorsGlobalConfiguration();
    }

    @Test
    void testcorsFilterNoNull(){
        CorsFilter corsFilter =  corsGlobalConfiguration.corsFilter();
        assertNotNull(corsFilter);

    }
    @Test
    void corsFilterBeanTipoCorrectoCorsFilter() {
        CorsFilter corsFilter = corsGlobalConfiguration.corsFilter();
        assertTrue(corsFilter instanceof CorsFilter);
    }

}
