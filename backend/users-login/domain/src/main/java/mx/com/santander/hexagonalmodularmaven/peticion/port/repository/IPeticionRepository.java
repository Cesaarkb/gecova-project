package mx.com.santander.hexagonalmodularmaven.peticion.port.repository;


import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;

public interface IPeticionRepository {
    PeticionModel create(PeticionModel peticion);
    PeticionModel update(Long id,PeticionModel peticion);
    void delete(Long id);
}
