package sv.edu.udb.service.mapper;

import org.mapstruct.Mapper;
import sv.edu.udb.controller.request.MateriaRequest;
import sv.edu.udb.controller.response.MateriaResponse;
import sv.edu.udb.repository.domain.Materia;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MateriaMapper {

    MateriaResponse toMateriaResponse(final Materia materia);

    List<MateriaResponse> toMateriaResponseList(final List<Materia> materiaList);

    Materia toMateria(final MateriaRequest materiaRequest);
}
