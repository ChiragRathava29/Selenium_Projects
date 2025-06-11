package com.ChiragRathava.Websites.CURA_Healthcare_Service;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Project_6_Using_ExpectedConditions_ExplicitWait {

    @Description("Automate the full flow for the Katalon site , Logout")
    @Test
    public void test_negative_cura_login() {

        WebDriver driver = new EdgeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // 1. Click on Make Appointment
        WebElement Make_Appointment = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-make-appointment")));
        Make_Appointment.click();

        // 2. Verify the Login URL
        String Login_URL = driver.getCurrentUrl();
        System.out.println("Login URL is: " + Login_URL);
        assert Login_URL.equals("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        // 3. Enter Username
        WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt-username")));
        Username.sendKeys("John Doe");

        // 4. Enter Password
        WebElement Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");

        // 5. Click Login
        WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-login")));
        Login.click();

        // 6. Verify the Appointment URL
        String Appointment_URL = wait.until(ExpectedConditions.urlToBe("https://katalon-demo-cura.herokuapp.com/#appointment"))
                ? driver.getCurrentUrl() : "INVALID";
        System.out.println("Appointment URL is: " + Appointment_URL);
        assert Appointment_URL.equals("https://katalon-demo-cura.herokuapp.com/#appointment");

        // 7. Select facility
        WebElement element_select = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("combo_facility")));
        Select select = new Select(element_select);
        select.selectByVisibleText("Seoul CURA Healthcare Center");

        // 8. Check box
        WebElement Check_Box = driver.findElement(By.id("chk_hospotal_readmission"));
        Check_Box.click();

        // 9. Click program radio
        WebElement Radio_Box = driver.findElement(By.id("radio_program_none"));
        Radio_Box.click();

        // 10. Enter visit date
        WebElement Calendar = driver.findElement(By.id("txt_visit_date"));
        Calendar.sendKeys("04-06-2025");

        // 11. Enter comment
        WebElement Comment_Box = driver.findElement(By.id("txt_comment"));
        Comment_Box.sendKeys("Hi! I am Rathava Chirag");

        // 12. Click Book Appointment
        WebElement Book_Appointment = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-book-appointment")));
        Book_Appointment.click();

        // 13. Verify Summary URL
        String Summary_URL = wait.until(ExpectedConditions.urlToBe("https://katalon-demo-cura.herokuapp.com/appointment.php#summary"))
                ? driver.getCurrentUrl() : "INVALID";
        System.out.println("Summary URL is: " + Summary_URL);
        assert Summary_URL.equals("https://katalon-demo-cura.herokuapp.com/appointment.php#summary");

        // 14. Verify summary details
        Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facility"))).getText(), "Seoul CURA Healthcare Center");
        Assert.assertEquals(driver.findElement(By.id("hospital_readmission")).getText(), "Yes");
        Assert.assertEquals(driver.findElement(By.id("program")).getText(), "None");
        Assert.assertEquals(driver.findElement(By.id("visit_date")).getText(), "04/06/2025");
        Assert.assertEquals(driver.findElement(By.id("comment")).getText(), "Hi! I am Rathava Chirag");

        // 15. Go to homepage
        WebElement Go_To_Homepage = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Go to Homepage")));
        Go_To_Homepage.click();

        // 16. Verify Home URL
        String Home_URL = wait.until(ExpectedConditions.urlToBe("https://katalon-demo-cura.herokuapp.com/"))
                ? driver.getCurrentUrl() : "INVALID";
        System.out.println("Home URL is: " + Home_URL);

        // 17. Open menu and click Logout
        WebElement Manu_Toggle = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu-toggle")));
        Manu_Toggle.click();

        WebElement Log_Out = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
        Log_Out.click();

        driver.quit();
    }
}
