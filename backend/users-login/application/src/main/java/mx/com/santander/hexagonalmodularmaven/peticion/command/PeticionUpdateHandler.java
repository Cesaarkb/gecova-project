package mx.com.santander.hexagonalmodularmaven.peticion.command;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.mapper.IPeticionDTOMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionUpdateService;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class PeticionUpdateHandler {

    private final IPeticionDTOMapper mapper;
    private final PeticionUpdateService service;

    public PeticionDTO execute(Long id, PeticionModel body){
        return mapper.toDTO(service.execute(id,body));
    }
}
