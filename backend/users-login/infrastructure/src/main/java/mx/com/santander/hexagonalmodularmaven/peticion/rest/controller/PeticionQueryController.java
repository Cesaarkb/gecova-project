package mx.com.santander.hexagonalmodularmaven.peticion.rest.controller;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.query.PeticionAllHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.query.PeticionByIdHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/peticion")
@RequiredArgsConstructor
public class PeticionQueryController {

    private final PeticionAllHandler peticionAllHandler;
    private final PeticionByIdHandler peticionByIdHandler;

    @GetMapping
    public ResponseEntity<List<PeticionDTO>> findAll(){
        return new ResponseEntity<>(peticionAllHandler.execute(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PeticionDTO> findById(@PathVariable(value = "id") Long id){
        return new ResponseEntity<>(peticionByIdHandler.execute(id),HttpStatus.OK);
    }
}
