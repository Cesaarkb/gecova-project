package mx.com.santander.hexagonalmodularmaven.peticion.service;


import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;

@AllArgsConstructor
public class PeticionUpdateService {

    private final IPeticionRepository peticionRepository;

    public PeticionModel execute(Long id, PeticionModel body){
        return peticionRepository.update(id, body);
    }
}
