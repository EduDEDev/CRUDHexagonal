package com.CRUDHexagonal.tasks.domain.ports.input;

import com.CRUDHexagonal.tasks.domain.models.Tasks;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {

    Optional<Tasks> getTaskById(Long id);
    List<Tasks> getAllTasks();
}
