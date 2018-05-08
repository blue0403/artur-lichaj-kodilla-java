package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private List<String> executedTasks = new ArrayList<>();

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing of " + taskName + ":\nBuy " + whatToBuy + " in quantity of " + quantity);
        if (taskName != null && whatToBuy != null && quantity > 0) {
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
