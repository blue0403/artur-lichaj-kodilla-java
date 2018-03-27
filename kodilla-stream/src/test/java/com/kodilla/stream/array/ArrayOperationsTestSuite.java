package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] randomNumbers = {2, 5, 14, 19, 23, 26, 31, 38, 44, 47, 53, 59, 62, 65, 70, 78, 81, 84, 92, 99};

        //When
        double averageOfNumbers = ArrayOperations.getAverage(randomNumbers);

        //Then
        Assert.assertEquals(49.6, averageOfNumbers, 0);
    }
}
