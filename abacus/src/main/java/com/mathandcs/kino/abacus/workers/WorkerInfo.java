package com.mathandcs.kino.abacus.workers;

import lombok.Data;

/**
 * Created by dashwang on 6/4/17.
 */
@Data
public class WorkerInfo {
    private Class<? extends Worker> clazz;
    private String taskType;

    public WorkerInfo addTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    public WorkerInfo addClazz(Class<? extends Worker> clazz) {
        this.clazz = clazz;
        return this;
    }
}
