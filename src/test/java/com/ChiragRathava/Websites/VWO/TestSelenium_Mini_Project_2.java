/* Find a Xpath */

package com.ChiragRathava.Websites.VWO;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium_Mini_Project_2 {

    @Description("Finds a Xpath")
    @Test
    public void Find_Xpath() throws Exception {

        WebDriver driver2 = new FirefoxDriver();
        driver2.manage().window().maximize();
        driver2.get("https://app.vwo.com/");

        WebElement Find_Xpath_of_Email2 = driver2.findElement(By.xpath("//input[@data-qa='hocewoqisi']"));
        Find_Xpath_of_Email2.sendKeys("hoxiji5811@nike4s.com");

        WebElement Find_Xpath_of_Password2 = driver2.findElement(By.xpath("//input[@name='password']"));
        Find_Xpath_of_Password2.sendKeys("6d!DJnd2uZLW8QG");

        WebElement Find_Xpath_of_Sign_in2 = driver2.findElement(By.xpath("//button[@onclick='login.login(event)']"));
        Find_Xpath_of_Sign_in2.click();

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/");

        WebElement Find_Xpath_of_Email = driver.findElement(By.xpath("//input[@name='username']"));
        Find_Xpath_of_Email.sendKeys("hoxiji5811@nike4s.com");

        WebElement Find_Xpath_of_Password = driver.findElement(By.xpath("//input[@id='login-password']"));
        Find_Xpath_of_Password.sendKeys("6d!DJnd2uZLW8QG");

        WebElement Find_Xpath_of_Sign_in = driver.findElement(By.xpath("//button[@data-qa='sibequkica']"));
        Find_Xpath_of_Sign_in.click();

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://app.vwo.com/");

        WebElement Find_Xpath_of_Email1 = driver1.findElement(By.xpath("//input[@id='login-username']"));
        Find_Xpath_of_Email1.sendKeys("hoxiji5811@nike4s.com");

        WebElement Find_Xpath_of_Password1 = driver1.findElement(By.xpath("//input[@class='text-input W(100%)']")); // Avoid - because of Dynamic
        Find_Xpath_of_Password1.sendKeys("6d!DJnd2uZLW8QG");

        WebElement Find_Xpath_of_Sign_in1 = driver1.findElement(By.xpath("//button[@id='js-login-btn']"));
        Find_Xpath_of_Sign_in1.click();

    }

}
