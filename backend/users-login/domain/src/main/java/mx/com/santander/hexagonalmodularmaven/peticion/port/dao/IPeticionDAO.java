package mx.com.santander.hexagonalmodularmaven.peticion.port.dao;


import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;

import java.util.List;

public interface IPeticionDAO {

    PeticionModel findById(Long id);
    List<PeticionModel> findAll();
}
