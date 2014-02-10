package com.seleniumsimplified.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;

import static junit.framework.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class FirstTest {
    @Test
    public void driverIsTheKing()
    {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://www.compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }
    @Test
    public void firefoxIsSupportedByWebDriver()
    {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
    }

    @Test
    public void ChromeIsSupportedByWebDriver()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/brianvaughan/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
        driver.quit();
    }

    @Test
    public void SafariIsSupportedByWebDriver()
    {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
        driver.quit();
    }
}



