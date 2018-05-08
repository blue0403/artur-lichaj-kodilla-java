package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private List<String> executedTasks = new ArrayList<>();

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing of " + taskName + ":\nPaint " + whatToPaint + " in " + color + " color");
        if (taskName != null && color != null && whatToPaint != null) {
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
