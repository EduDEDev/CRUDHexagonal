package com.CRUDHexagonal.tasks.application.usecases;

import com.CRUDHexagonal.tasks.domain.models.Tasks;
import com.CRUDHexagonal.tasks.domain.ports.input.CreateTaskUseCase;
import com.CRUDHexagonal.tasks.domain.ports.output.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;


    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public Tasks createTask(Tasks tasks) {
        return taskRepositoryPort.save(tasks);
    }
}
