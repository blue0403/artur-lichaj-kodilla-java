package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numbers);
        boolean result = evenNumbers.isEmpty();
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, evenNumbers.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        //When
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numbers);
        boolean result = evenNumbers.contains(2);
        System.out.println("Testing normal list");
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1, evenNumbers.size());
    }
}
