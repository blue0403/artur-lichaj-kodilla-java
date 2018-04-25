package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Create RPM Game");
        board.getInProgressList().addTask("Create Flight Search Engine");
        board.getDoneList().addTask("Create Calculator");

        //Then
        Assert.assertEquals("Create RPM Game", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Create Flight Search Engine", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Create Calculator", board.getDoneList().getTasks().get(0));
    }
}
