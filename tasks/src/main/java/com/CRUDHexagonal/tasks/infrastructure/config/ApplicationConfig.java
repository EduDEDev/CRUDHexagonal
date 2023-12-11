package com.CRUDHexagonal.tasks.infrastructure.config;

import com.CRUDHexagonal.tasks.application.services.TaskService;
import com.CRUDHexagonal.tasks.application.usecases.*;
import com.CRUDHexagonal.tasks.domain.ports.input.GetAdditionalTaskInfoUseCase;
import com.CRUDHexagonal.tasks.domain.ports.output.ExternalServicePort;
import com.CRUDHexagonal.tasks.domain.ports.output.TaskRepositoryPort;
import com.CRUDHexagonal.tasks.infrastructure.adapters.ExternalServiceAdapter;
import com.CRUDHexagonal.tasks.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort,
                                   GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase){
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServiceAdapter externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
