package mx.com.santander.hexagonalmodularmaven.peticiones.adapter.jpa.repository;


import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.dto.Peticiones;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.entity.PeticionesEntity;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.jpa.PeticionesSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.peticiones.adapter.mapper.PeticionesDboMapper;

@RequiredArgsConstructor
public class PeticionesRepository { //implements PeticionesRespository {
private PeticionesDboMapper dboMapper;
private PeticionesSpringJpaAdapterRepository repositoryJPA;

   // @Override
    public Peticiones create(Peticiones peticion) {
        PeticionesEntity entity =  dboMapper.toEntity(peticion);
        PeticionesEntity save = repositoryJPA.save(entity);

        return  dboMapper.toDomain(save);
    }

    public Peticiones update(Peticiones peticion){
        PeticionesEntity entity = dboMapper.toEntity(peticion);
                PeticionesEntity update = repositoryJPA.save(entity);
                return dboMapper.toDomain(update);
    }

    public void delete(Long id){
        repositoryJPA.deleteById(id);
    }

}
