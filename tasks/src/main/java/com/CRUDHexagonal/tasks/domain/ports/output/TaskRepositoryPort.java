package com.CRUDHexagonal.tasks.domain.ports.output;


import com.CRUDHexagonal.tasks.domain.models.Tasks;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {

    Tasks save(Tasks tasks);
    Optional<Tasks> findById(Long id);
    List<Tasks> findAll();
    Optional<Tasks> update(Tasks tasks);
    boolean deleteById(Long id);

}
