package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Initialized StandardEnvironment with PropertySources");

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("Initialized StandardEnvironment with PropertySources", lastLog);
    }
}
