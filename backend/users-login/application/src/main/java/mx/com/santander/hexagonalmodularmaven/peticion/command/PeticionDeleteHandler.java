package mx.com.santander.hexagonalmodularmaven.peticion.command;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.service.PeticionDeleteService;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PeticionDeleteHandler {

    private final PeticionDeleteService service;

    public void execute(Long id){
        service.execute(id);
    }
}
