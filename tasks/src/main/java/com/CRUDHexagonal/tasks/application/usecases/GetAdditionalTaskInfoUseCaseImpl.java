package com.CRUDHexagonal.tasks.application.usecases;

import com.CRUDHexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.CRUDHexagonal.tasks.domain.ports.input.GetAdditionalTaskInfoUseCase;
import com.CRUDHexagonal.tasks.domain.ports.output.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;


    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}
