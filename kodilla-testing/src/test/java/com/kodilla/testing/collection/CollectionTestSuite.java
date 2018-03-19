package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
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
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        exterminator.exterminate(numbers);
        boolean result = numbers.isEmpty();
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, numbers.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        //When
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numbers);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(1, numbers.size());
        Assert.assertEquals(1, evenNumbers.size());
    }
}
