package com.CRUDHexagonal.tasks.application.usecases;

import com.CRUDHexagonal.tasks.domain.ports.input.DeleteTaskUseCase;
import com.CRUDHexagonal.tasks.domain.ports.output.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;


    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
