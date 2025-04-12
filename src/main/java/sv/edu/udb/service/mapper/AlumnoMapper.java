package sv.edu.udb.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sv.edu.udb.controller.request.AlumnoRequest;
import sv.edu.udb.controller.response.AlumnoResponse;
import sv.edu.udb.repository.domain.Alumno;
import sv.edu.udb.controller.response.MateriaResponse;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MateriaMapper.class})
public interface AlumnoMapper {

    // De Entidad Alumno a AlumnoResponse
    @Mapping(source = "materia", target = "materia")
    AlumnoResponse toAlumnoResponse(final Alumno alumno);


    List<AlumnoResponse> toAlumnoResponseList(final List<Alumno> alumnoList);

    // De AlumnoRequest a Entidad Alumno
    @Mapping(source = "idMateria", target = "materia.id")
    Alumno toAlumno(final AlumnoRequest alumnoRequest);

}
