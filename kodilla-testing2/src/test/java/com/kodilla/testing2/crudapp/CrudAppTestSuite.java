package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://blue0403.github.io/";
    private WebDriver driver;

    @Before
    public void initTest() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }
}
