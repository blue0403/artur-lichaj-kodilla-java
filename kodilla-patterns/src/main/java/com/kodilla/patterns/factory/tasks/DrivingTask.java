package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private List<String> executedTasks = new ArrayList<>();

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing of " + taskName + ":\nDrive to " + where + " using " + using);
        if (taskName != null && where != null && using != null) {
            executedTasks.add(taskName);
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean result = false;

        if (executedTasks.size() > 0) {
            result = true;
        }
        return result;
    }
}
