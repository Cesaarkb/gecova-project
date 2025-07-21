package mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.dao;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.jpa.IPeticionAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.peticion.adapter.mapper.PeticionMapper;
import mx.com.santander.hexagonalmodularmaven.peticion.model.entity.PeticionModel;
import mx.com.santander.hexagonalmodularmaven.peticion.model.exception.PeticionNotFoundException;
import mx.com.santander.hexagonalmodularmaven.peticion.port.dao.IPeticionDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class PeticionDAOAdapter implements IPeticionDAO {

    private final IPeticionAdapterRepository repository;
    private final PeticionMapper mapper;

    @Override
    public PeticionModel findById(Long id) {

        return mapper.toDomain(repository.findById(id).orElseThrow(()-> new PeticionNotFoundException("Peticion no encontrada")));
    }

    @Override
    public List<PeticionModel> findAll() {
        return repository.findAll().stream().map(mapper::toDomain).collect(Collectors.toList());
    }
}
