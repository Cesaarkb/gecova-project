package mx.com.santander.hexagonalmodularmaven.peticiones.adapter.jpa;

import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.entity.PeticionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeticionesSpringJpaAdapterRepository extends JpaRepository<PeticionesEntity,Long> {
}
