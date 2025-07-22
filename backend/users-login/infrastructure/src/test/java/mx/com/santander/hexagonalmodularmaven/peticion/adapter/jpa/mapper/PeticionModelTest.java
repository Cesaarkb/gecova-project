package mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.mapper;

import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;

import java.math.BigDecimal;

public class PeticionModelTest {

    public static PeticionModel createValidModel(){
        return new PeticionModel( 1L,
                "Santander",
                "Minsait",
                "carlos alberto",
                "postulante dev",
                "indra",
                "Alta",
                2,
                "Temporal",
                "PRJ001",
                "Proyecto Uno",
                "Elemento X",
                2,
                "Remoto",
                "Oficina Central",
                "Full-time",
                "Plan A",
                "Desarrollador",
                "Evaluador 1",
                2.0,
                2.3,
                "Interno",
                new BigDecimal("23.00"),
                new BigDecimal("23.00"),
                "Plan B",
                "Sin comentarios",
                "Senior",
                "Nivel 3",
                "Java, Spring",
                "Contabilidad"
        );
    }
}
