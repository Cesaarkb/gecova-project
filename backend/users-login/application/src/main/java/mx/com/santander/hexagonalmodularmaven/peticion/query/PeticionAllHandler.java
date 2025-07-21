package mx.com.santander.hexagonalmodularmaven.peticion.query;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.mapper.IPeticionDTOMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionAllService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class PeticionAllHandler {
    private final IPeticionDTOMapper mapper;
    private final PeticionAllService peticionAllService;

    public List<PeticionDTO> execute(){
        return peticionAllService.execute().stream().map(mapper::toDTO).collect(Collectors.toList());
    }
}
