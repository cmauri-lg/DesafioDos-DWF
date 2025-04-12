package sv.edu.udb.service.implementation;

import jakarta.persistence.EntityNotFoundException;
import sv.edu.udb.controller.request.AlumnoRequest;
import sv.edu.udb.controller.request.MateriaRequest;
import sv.edu.udb.controller.response.AlumnoResponse;
import sv.edu.udb.controller.response.MateriaResponse;
import sv.edu.udb.repository.AlumnoRepository;
import sv.edu.udb.repository.domain.Alumno;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.service.AlumnoService;
import sv.edu.udb.service.mapper.AlumnoMapper;

import java.util.List;

public class AlumnoServiceImplementation implements AlumnoService {

    private final AlumnoRepository alumnoRepository;

    private final AlumnoMapper alumnoMapper;

    public AlumnoServiceImplementation(AlumnoRepository alumnoRepository, AlumnoMapper alumnoMapper) {
        this.alumnoRepository = alumnoRepository;
        this.alumnoMapper = alumnoMapper;
    }

    @Override
    public List<AlumnoResponse> findAll(){
        return alumnoMapper.toAlumnoResponseList(alumnoRepository.findAll());
    }

    @Override
    public AlumnoResponse findById(final Long id){
        return alumnoMapper.toAlumnoResponse(
                alumnoRepository.findById(id)
                        .orElseThrow(()->
                                new EntityNotFoundException("Recurso no encontrado id: " + id)));
    }

    @Override
    public AlumnoResponse save(final AlumnoRequest alumnoRequest){
        final Alumno alumno = alumnoMapper.toAlumno(alumnoRequest);
        return alumnoMapper.toAlumnoResponse(alumnoRepository.save(alumno));
    }

    @Override
    public AlumnoResponse update(final Long id, final AlumnoRequest alumnoRequest){
        final Alumno alumnoToUpdate = alumnoRepository.findById(id)
                .orElseThrow(()->
                        new EntityNotFoundException("Recurso no encontrado id: " + id));
        alumnoToUpdate.setNombre(alumnoRequest.getNombre());
        alumnoToUpdate.setApellido(alumnoRequest.getApellido());
        alumnoToUpdate.setMateria(alumnoToUpdate.getMateria());
        alumnoRepository.save(alumnoToUpdate);
        return alumnoMapper.toAlumnoResponse(alumnoToUpdate);
    }

    @Override
    public void delete(final Long id){
        alumnoRepository.deleteById(id);
    }
}
