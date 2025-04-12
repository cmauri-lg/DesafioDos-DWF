package sv.edu.udb.service;

import org.springframework.stereotype.Service;
import sv.edu.udb.controller.request.MateriaRequest;
import sv.edu.udb.controller.response.MateriaResponse;

import java.util.List;

@Service
public interface MateriaService {

    List<MateriaResponse> findAll();

    MateriaResponse findById(final Long id);

    MateriaResponse save(final MateriaRequest materiaRequest);

    MateriaResponse update(final Long id, final MateriaRequest materiaRequest);

    void delete(final Long id);

}
