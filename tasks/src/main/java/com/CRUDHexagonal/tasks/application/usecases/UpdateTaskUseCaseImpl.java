package com.CRUDHexagonal.tasks.application.usecases;

import com.CRUDHexagonal.tasks.domain.models.Tasks;
import com.CRUDHexagonal.tasks.domain.ports.input.UpdateTaskUseCase;
import com.CRUDHexagonal.tasks.domain.ports.output.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;


    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public Optional<Tasks> updateTask(Long id, Tasks updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
