package com.CRUDHexagonal.tasks.domain.ports.input;

import com.CRUDHexagonal.tasks.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {

    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
