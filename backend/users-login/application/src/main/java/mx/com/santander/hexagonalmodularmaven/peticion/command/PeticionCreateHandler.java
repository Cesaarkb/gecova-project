package mx.com.santander.hexagonalmodularmaven.peticion.command;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.mapper.IPeticionDTOMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.command.PeticionCreateCommand;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionCreateService;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PeticionCreateHandler {

    private final IPeticionDTOMapper mapper;
    private final PeticionCreateService service;

    public PeticionDTO execute(PeticionCreateCommand peticionCreateCommand){
        return mapper.toDTO(service.execute(peticionCreateCommand));
    }
}
