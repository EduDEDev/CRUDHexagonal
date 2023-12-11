package com.CRUDHexagonal.tasks.domain.ports.output;

import com.CRUDHexagonal.tasks.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {

    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
