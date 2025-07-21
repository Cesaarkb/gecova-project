package mx.com.santander.hexagonalmodularmaven.peticion.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.port.dao.IPeticionDAO;


@RequiredArgsConstructor
public class PeticionByIdService {

    private final IPeticionDAO peticionDAO;

    public PeticionModel execute(Long id){
        return peticionDAO.findById(id);
    }

}
