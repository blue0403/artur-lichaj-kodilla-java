package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student ryanStone = new Student("Ryan Stone");
        Student amyMiller = new Student("Amy Miller");
        Student patrickJones = new Student("Patrick Jones");
        Student sylviaJefferson = new Student("Sylvia Jefferson");
        Student arthurKing = new Student("Arthur King");
        Mentor andrewBlack = new Mentor("Andrew Black");
        Mentor saraWhite = new Mentor("Sara White");
        ryanStone.registerObserver(andrewBlack);
        amyMiller.registerObserver(andrewBlack);
        patrickJones.registerObserver(saraWhite);
        sylviaJefferson.registerObserver(saraWhite);
        arthurKing.registerObserver(andrewBlack);
        //When
        ryanStone.addTask("First Task");
        patrickJones.addTask("First Task");
        amyMiller.addTask("First Task");
        ryanStone.addTask("Second Task");
        sylviaJefferson.addTask("First Task");
        arthurKing.addTask("First Task");
        amyMiller.addTask("Second Task");
        patrickJones.addTask("Second Task");
        arthurKing.addTask("Second Task");
        amyMiller.addTask("Third Task");
        arthurKing.addTask("Third Task");

        //Then
        assertEquals(8, andrewBlack.getUpdateCount());
        assertEquals(3, saraWhite.getUpdateCount());
    }
}
