package mx.com.santander.hexagonalmodularmaven.peticiones.adapter.jpa.dao;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.dto.Peticiones;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.entity.PeticionesEntity;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.jpa.PeticionesSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.mapper.PeticionesDboMapper;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class PeticionesDAO {

    private final PeticionesDboMapper dboMapper;
    private final PeticionesSpringJpaAdapterRepository repository;


    public Peticiones peticionById (Long id){
        var peticion = repository.findById(id);
        return dboMapper.toDomain(peticion.get());
    }

    public List<Peticiones> getAllPeticiones(){

    return repository.findAll()
        .stream()
        .map(dboMapper::toDomain)
        .collect(Collectors.toList());
    }
}
