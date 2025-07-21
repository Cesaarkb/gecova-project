package mx.com.santander.hexagonalmodularmaven.peticion.query;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.mapper.IPeticionDTOMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionByIdService;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PeticionByIdHandler {
    private final IPeticionDTOMapper mapper;
    private final PeticionByIdService peticion;

    public PeticionDTO execute(Long id){
        return mapper.toDTO(peticion.execute(id));
    }
}
