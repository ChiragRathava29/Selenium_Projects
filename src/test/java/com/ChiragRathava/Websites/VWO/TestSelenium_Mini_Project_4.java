/* Text Match */

// Using a Xpath Functions

package com.ChiragRathava.Websites.VWO;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Mini_Project_4 {

    private WebDriver driver;

    @Description("Text Match")
    @Test
    public void Tect_Match() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vwo.com/");

        /* also able to use and or Opration */
        WebElement signInBtn = driver.findElement(By.xpath("//button[@type='submit' and @id='js-login-btn']"));
        signInBtn.click();


        WebElement Logo = driver.findElement(By.xpath("//img[@alt='VWO']"));
        String actualAlt = Logo.getAttribute("alt");
        System.out.println("Logo alt attribute: " + actualAlt);
        Assert.assertEquals(actualAlt, "VWO", "Alt text does not match for the logo.");

        WebElement h5 = driver.findElement(By.xpath("//h5[text()='Sign in to VWO platform']"));
        String h5Text = h5.getText();
        System.out.println("Found h5 text: " + h5Text);
        Assert.assertTrue(h5.isDisplayed(), "Sign in to VWO platform heading is not displayed");

        WebElement email = driver.findElement(By.xpath("//label[starts-with(text(),'Email')]"));
        String emailText = email.getText();
        System.out.println("Found email Text: " + emailText);
        Assert.assertEquals(emailText,"Email address","not a same");

        WebElement password = driver.findElement(By.xpath("//label[text()='Password']"));
        String passwordText = password.getText();
        System.out.println("Found Password Text: " + passwordText);
        Assert.assertEquals(passwordText,"Password","Not match");

        WebElement remember_me = driver.findElement(By.xpath("//span[contains(text(),'me')]"));
        String rememberText = remember_me.getText();
        System.out.println("Found Text: " + rememberText);
        Assert.assertEquals(rememberText,"Remember me","Not match");

        WebElement remember = driver.findElement(By.xpath("//span[normalize-space(text()='Rememberme')]"));
        Assert.assertEquals(rememberText,"Remember me","not match");


        WebElement sign_in = driver.findElement(By.xpath("//span[text()='Sign in']"));
        String signTest = sign_in.getText();
        System.out.println("Found Text: " + signTest);
        Assert.assertEquals(signTest,"Sign in","Not match");

        /* Special Case */
        WebElement Just_line = driver.findElement(By.xpath("//*[contains(text(),\"Don't have an account?\")]")); // //*[contains(text(),"Don't have an account?")]
        String not_specify_text_in_tag = Just_line.getText().split("Start a free trial")[0].trim();
        System.out.println("Text 1: " + not_specify_text_in_tag);
        Assert.assertEquals(not_specify_text_in_tag, "Don't have an account?", "Text did not match!");

        WebElement line_in_a = driver.findElement(By.xpath("//a[text()=\"Start a free trial\"]"));
        String line_Text = line_in_a.getText();
        System.out.println("Text 2: " + line_Text);
        Assert.assertEquals(line_Text,"Start a free trial","Not Match");

//        String not_specify_text_in_tag = Just_line.getText();
//        System.out.println("Found Text: " + not_specify_text_in_tag);
//        Assert.assertEquals(not_specify_text_in_tag,"Don't have an account?","Not found");

        WebElement click = driver.findElement(By.xpath("//button[@id='js-login-btn']//span[text()='Sign in']"));
        click.click();

        driver.quit();
        System.out.println("Test completed and browser closed.");


    }


}
