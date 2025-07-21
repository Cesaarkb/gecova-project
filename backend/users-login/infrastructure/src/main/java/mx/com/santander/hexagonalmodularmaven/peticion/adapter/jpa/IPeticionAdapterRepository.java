package mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa;


import mx.com.santander.hexagonalmodularmaven.peticion.adapter.entity.PeticionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPeticionAdapterRepository extends JpaRepository<PeticionEntity,Long> {
}
