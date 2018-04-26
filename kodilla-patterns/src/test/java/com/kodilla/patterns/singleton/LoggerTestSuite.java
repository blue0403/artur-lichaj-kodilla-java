package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = new Logger();
        logger.log("Initialized StandardEnvironment with PropertySources");

        //When
        String lastLog = logger.getLastLog();

        //Then
        Assert.assertEquals("Initialized StandardEnvironment with PropertySources", lastLog);
    }
}
