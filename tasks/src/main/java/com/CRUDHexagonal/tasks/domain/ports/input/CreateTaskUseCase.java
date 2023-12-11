package com.CRUDHexagonal.tasks.domain.ports.input;

import com.CRUDHexagonal.tasks.domain.models.Tasks;

public interface CreateTaskUseCase {

    Tasks createTask(Tasks tasks);
}
