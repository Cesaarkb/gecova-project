package mx.com.santander.hexagonalmodularmaven.peticion.service;


import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.command.PeticionCreateCommand;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;

@RequiredArgsConstructor
public class PeticionCreateService {

    private final IPeticionRepository peticionRepository;

    public PeticionModel execute(PeticionCreateCommand body){
        PeticionModel peticion = new PeticionModel().requesToCreate(body);
        return peticionRepository.create(peticion);
    }    

}
