package mx.com.santander.hexagonalmodularmaven.peticion.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.port.dao.IPeticionDAO;


@RequiredArgsConstructor
public class PeticionAllService {

    private final IPeticionDAO peticionDAO;

    public List<PeticionModel> execute(){
        return peticionDAO.findAll();
    }
}
