package com.CRUDHexagonal.tasks.application.usecases;

import com.CRUDHexagonal.tasks.domain.models.Tasks;
import com.CRUDHexagonal.tasks.domain.ports.input.RetrieveTaskUseCase;
import com.CRUDHexagonal.tasks.domain.ports.output.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;


    public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public Optional<Tasks> getTaskById(Long id) {
        return  taskRepositoryPort.findById(id);
    }

    @Override
    public List<Tasks> getAllTasks() {
        return taskRepositoryPort.findAll();
    }
}
