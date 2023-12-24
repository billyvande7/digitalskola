package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    WebDriver webDriver;

    @Test
    public void allTest(){
        WebDriverManager.firefoxdriver();
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://yopmail.com/");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ycpt")));

        webDriver.findElement(By.id("login")).sendKeys("automationtest");
        webDriver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/div[1]/div[2]/div/div/form/div/div[1]/div[4]/button/i")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bname")));
        WebElement iframe = webDriver.findElement(By.id("ifmail"));
        webDriver.switchTo().frame(iframe);

        String emailContent = webDriver.findElement(By.id("mail")).getText();

        System.out.println("Content: \n" + emailContent);

        webDriver.quit();
    }
}
