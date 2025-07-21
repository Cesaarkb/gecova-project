package mx.com.santander.hexagonalmodularmaven.peticion.rest.controller;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.command.PeticionCreateHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.command.PeticionDeleteHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.command.PeticionUpdateHandler;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.PeticionDTO;
import mx.com.santander.hexagonalmodularmaven.peticion.model.dto.command.PeticionCreateCommand;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/peticion")
@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class PeticionCommandController {
    private final PeticionCreateHandler peticionCreateHandler;
    private final PeticionUpdateHandler peticionUpdateHandler;
    private final PeticionDeleteHandler peticionDeleteHandler;

    @PostMapping
    public ResponseEntity<PeticionDTO> create(@RequestBody PeticionCreateCommand body){
        return new ResponseEntity<>(peticionCreateHandler.execute(body), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PeticionDTO> update(@PathVariable(value = "id") Long id, @RequestBody PeticionModel body){
        return new ResponseEntity<>(peticionUpdateHandler.execute(id,body),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable(value = "id")Long id){
        peticionDeleteHandler.execute(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
