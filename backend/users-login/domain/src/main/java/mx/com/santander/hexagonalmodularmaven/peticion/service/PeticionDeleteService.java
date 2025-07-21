package mx.com.santander.hexagonalmodularmaven.peticion.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.port.repository.IPeticionRepository;

@RequiredArgsConstructor
public class PeticionDeleteService {

    private final IPeticionRepository peticionRepository;

    public void execute(Long id){
        peticionRepository.delete(id);
    }
}
