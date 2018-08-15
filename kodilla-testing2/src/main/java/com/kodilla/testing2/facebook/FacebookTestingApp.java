package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"5k_5\")]/span[@data-name=\"birthday_wrapper\"]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"5k_5\")]/span[@data-name=\"birthday_wrapper\"]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"5k_5\")]/span[@data-name=\"birthday_wrapper\"]/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectComboDays = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDays);
        selectDay.selectByIndex(4);

        WebElement selectComboMonths = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonths);
        selectMonth.selectByIndex(7);

        WebElement selectComboYears = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYears);
        selectYear.selectByValue("1995");
    }
}
