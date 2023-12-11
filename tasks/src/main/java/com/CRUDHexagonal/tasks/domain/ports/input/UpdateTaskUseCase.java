package com.CRUDHexagonal.tasks.domain.ports.input;

import com.CRUDHexagonal.tasks.domain.models.Tasks;

import java.util.Optional;

public interface UpdateTaskUseCase {

    Optional<Tasks> updateTask(Long id, Tasks updateTask);
}
