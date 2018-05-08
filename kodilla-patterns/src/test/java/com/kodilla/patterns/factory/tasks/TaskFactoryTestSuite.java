package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Shopping task", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Painting task", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }
}
