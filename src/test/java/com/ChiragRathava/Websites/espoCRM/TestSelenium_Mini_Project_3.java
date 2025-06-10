/* Find Xpath for Login button */

package com.ChiragRathava.Websites.espoCRM;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Mini_Project_3 {

    @Description("Find Xpath of Login button")
    @Test
    public void Xpath_login() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.us.espocrm.com/");

        Thread.sleep(3000);

        WebElement Xpath_of_login = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        Xpath_of_login.click();

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://demo.us.espocrm.com/");

        Thread.sleep(3000);

        WebElement Xpath_of_login_ = driver1.findElement(By.xpath("//button[@class='btn btn-primary btn-s-wide']"));
        Xpath_of_login_.click();

    }

}
