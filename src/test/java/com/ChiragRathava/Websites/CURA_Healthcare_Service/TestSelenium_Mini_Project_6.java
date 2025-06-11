package com.ChiragRathava.Websites.CURA_Healthcare_Service;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSelenium_Mini_Project_6 {
    @Description("Automate the full flow for the Katalon site , Logout")
    @Test
    public void test_navigate_cura_login() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // 1.  click to MakeAppointment button
        WebElement Make_Appointment = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        Make_Appointment.click();


        // 2. Verify the URL
        String Login_URL = driver.getCurrentUrl();
        System.out.println("Login URL is: " + Login_URL);
        assert Login_URL.equals("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        // 3. Enter Username
        WebElement Username = driver.findElement(By.cssSelector("input[id='txt-username']"));
        Username.sendKeys("John Doe");

        // 4. Enter Password
        WebElement Password = driver.findElement(By.cssSelector("input[id='txt-password']"));
        Password.sendKeys("ThisIsNotAPassword");

        // 5. Click to Login button
        WebElement Login = driver.findElement(By.xpath("//button[@id='btn-login']"));
        Login.click();


        // 6. Verify the URL
        String Appointment_URL = driver.getCurrentUrl();
        System.out.println("Appointment URL is: " + Appointment_URL);
        assert Appointment_URL.equals("https://katalon-demo-cura.herokuapp.com/#appointment");

        // 7. Select Option-3
        WebElement element_select =driver.findElement(By.cssSelector("select[id='combo_facility']"));
        Select select = new Select(element_select);
        select.selectByVisibleText("Seoul CURA Healthcare Center");

        // 8. check box
        WebElement Check_Box = driver.findElement(By.cssSelector("input[id='chk_hospotal_readmission']"));
        Check_Box.click();

        // 9. click 3 option
        WebElement Radio_Box = driver.findElement(By.cssSelector("input[id='radio_program_none']"));
        Radio_Box.click();

        // 10. Enter a date (dd/mm/yyyy)
        WebElement Calendar = driver.findElement(By.cssSelector("input[id='txt_visit_date']"));
        Calendar.sendKeys("04-06-2025");

        // 11. Write a Comment
        WebElement Comment_Box = driver.findElement(By.cssSelector("textarea[id='txt_comment']"));
        Comment_Box.sendKeys("Hi! I am Rathava Chirag");

        // 12. Click on Book Appointment
        WebElement Book_Appointment = driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
        Book_Appointment.click();

        // 13. Verify the URL
        String Summary_URL = driver.getCurrentUrl();
        System.out.println("Summary URL is: " + Summary_URL);
        assert Summary_URL.equals("https://katalon-demo-cura.herokuapp.com/appointment.php#summary");

        /* 14. Verify the Details */
        WebElement Line_1 = driver.findElement(By.id("facility"));
        String Facility = Line_1.getText();
        Assert.assertEquals(Facility,"Seoul CURA Healthcare Center");

        WebElement Line_2 = driver.findElement(By.id("hospital_readmission"));
        String Apply_for_hospital_readmission = Line_2.getText();
        Assert.assertEquals(Apply_for_hospital_readmission,"Yes");

        WebElement Line_3 = driver.findElement(By.id("program"));
        String Healthcare_Program = Line_3.getText();
        Assert.assertEquals(Healthcare_Program,"None");

        WebElement Line_4 = driver.findElement(By.id("visit_date"));
        String Visit_Date = Line_4.getText();
        Assert.assertEquals(Visit_Date,"04/06/2025");

        WebElement Line_5 = driver.findElement(By.id("comment"));
        String Comment = Line_5.getText();
        Assert.assertEquals(Comment,"Hi! I am Rathava Chirag");

        // 15. Click on Go to Homepage
        WebElement Go_To_Homepage = driver.findElement(By.linkText("Go to Homepage"));
        Go_To_Homepage.click();


        // 16. Verify URl
        String Home_URL = driver.getCurrentUrl();
        System.out.println("Home URL is: " + Home_URL);
        assert Home_URL.equals("https://katalon-demo-cura.herokuapp.com/");

        // 17. Go to Manu
        WebElement Manu_Toggle = driver.findElement(By.id("menu-toggle"));
        Manu_Toggle.click();

        // 18. click on Logout
        WebElement Log_Out = driver.findElement(By.linkText("Logout"));
        Log_Out.click();

        driver.quit();

    }
}
