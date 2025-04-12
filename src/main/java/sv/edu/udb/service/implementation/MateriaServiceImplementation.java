package sv.edu.udb.service.implementation;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import sv.edu.udb.controller.request.MateriaRequest;
import sv.edu.udb.controller.response.MateriaResponse;
import sv.edu.udb.repository.MateriaRepository;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.service.MateriaService;
import sv.edu.udb.service.mapper.MateriaMapper;

import java.util.List;

public class MateriaServiceImplementation implements MateriaService{

    private final MateriaRepository materiaRepository;

    private final MateriaMapper materiaMapper;

    public MateriaServiceImplementation(MateriaRepository materiaRepository, MateriaMapper materiaMapper) {
        this.materiaRepository = materiaRepository;
        this.materiaMapper = materiaMapper;
    }

    @Override
    public List<MateriaResponse> findAll(){
        return materiaMapper.toMateriaResponseList(materiaRepository.findAll());
    }

    @Override
    public MateriaResponse findById(final Long id){
        return materiaMapper.toMateriaResponse(
                materiaRepository.findById(id)
                        .orElseThrow(()->
                                new EntityNotFoundException("Recurso no encontrado id: " + id)));
    }

    @Override
    public MateriaResponse save(final MateriaRequest materiaRequest){
        final Materia materia = materiaMapper.toMateria(materiaRequest);
        return materiaMapper.toMateriaResponse(materiaRepository.save(materia));
    }

    @Override
    public MateriaResponse update(final Long id, final MateriaRequest materiaRequest ){
        final Materia materiaToUpdate = materiaRepository.findById(id)
                .orElseThrow(()->
                        new EntityNotFoundException("Recurso no encontrado id: " + id));
        materiaToUpdate.setNombre(materiaRequest.getNombre());
        materiaRepository.save(materiaToUpdate);
        return materiaMapper.toMateriaResponse(materiaToUpdate);
    }

    @Override
    public void delete(final Long id){
        materiaRepository.deleteById(id);
    }
}
