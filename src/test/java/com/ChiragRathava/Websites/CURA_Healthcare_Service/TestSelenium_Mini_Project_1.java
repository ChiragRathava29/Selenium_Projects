// 1. Open the URL - https://katalon-demo-cura.herokuapp.com/
// 2. Enter the username and password
// 3. Verify that the current URL changes to https://katalon-demo-cura.herokuapp.com/#appointment

package com.ChiragRathava.Websites.CURA_Healthcare_Service;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Mini_Project_1 {

    @Description("Verify that current URL changes!")
    @Test
    public void test_negative_cura_login() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // 1. Find the login page
        // <a
        // id="menu-toggle"
        // href="#"
        // class="btn btn-dark btn-lg toggle"
        // >
        // <i
        // class="fa fa-bars"
        // >
        // </i>
        // </a>

        WebElement Find_Login_page = driver.findElement(By.id("menu-toggle"));
        Find_Login_page.click();

        Thread.sleep(2000);

        // 2. Click on the login
        // <a
        // href="profile.php#login"
        // onclick="$('#menu-close').click();"
        // >
        // Login
        // </a>

        WebElement Finded_Login = driver.findElement(By.linkText("Login"));
        Finded_Login.click();

        Thread.sleep(2000);

        // 3. Verify that the current URL changes to https://katalon-demo-cura.herokuapp.com/profile.php#login

        String Current_URL = driver.getCurrentUrl();
        System.out.println("Current URL is: " + Current_URL);
        assert Current_URL.equals("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        Thread.sleep(2000);

        // 4. Find the username and enter the username = John Doe
        // <input
        // type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value="" autocomplete="off">

        WebElement Find_Username = driver.findElement(By.id("txt-username"));
        Find_Username.sendKeys("John Doe");

        Thread.sleep(2000);

        // 5. Find the password and enter the password = ThisIsNotAPassword
        // <input
        // type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value=""
        // autocomplete="off">

        WebElement Find_Password = driver.findElement(By.name("password"));
        Find_Password.sendKeys("ThisIsNotAPassword");

        Thread.sleep(2000);

        // 6. Click on the login button
        // <button
        // id="btn-login"
        // type="submit"
        // class="btn btn-default"
        // >
        // Login
        // </button>

        WebElement Find_Login_Button = driver.findElement(By.id("btn-login"));
        Find_Login_Button.click();

        Thread.sleep(2000);

        // 7. Verify that the current URL changes to https://katalon-demo-cura.herokuapp.com/#appointment

        Current_URL = driver.getCurrentUrl();
        System.out.println("Current URL is: " + Current_URL);
        assert Current_URL.equals("https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(2000);

        driver.quit();

    }
}
