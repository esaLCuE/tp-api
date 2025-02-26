/*
package fr.afpa.pompey.cda.api;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URL;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SeleniumTest {

    WebDriver driver = null;


    @BeforeEach
    public void setUp() {
        URL resource = getClass().getClassLoader().getResource("driver/chromedriver.exe");
        if (resource == null) {
            throw new IllegalArgumentException("File not found!");
        } else {
            String chromedriverPath = resource.getFile().substring(1);
            System.setProperty("webdriver.chrome.driver", chromedriverPath);

            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver(options);
        }
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLoginSelenium() {
        driver.get("http://localhost:8080/demoWeb_war_exploded/index.jsp");

        WebElement loginInput = driver.findElement(By.name("login"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement nameInput = driver.findElement(By.name("name"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        loginInput.sendKeys("esalcue");
        passwordInput.sendKeys("azerty123");
        nameInput.sendKeys("lch");
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlToBe("http://localhost:8080/demoWeb_war_exploded/login"));

        WebElement welcomeMessage = driver.findElement(By.id("welcome"));
        assertTrue(welcomeMessage.isDisplayed());
        assertEquals("Mo Compte", welcomeMessage.getText());

    }

}

 */