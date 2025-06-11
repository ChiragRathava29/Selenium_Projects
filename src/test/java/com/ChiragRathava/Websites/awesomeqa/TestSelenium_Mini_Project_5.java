package com.ChiragRathava.Websites.awesomeqa;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Mini_Project_5 {

    @Description("XPath Axes")
    @Test
    public void use_Axes() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/xpath/");


        // self -> We able to find all
        WebElement self = driver.findElement(By.xpath("//div[@class='Mammal']"));
        String Text = self.getText();
        System.out.println("Text : " + Text);

        // Ancestors -> able to find Root_node
        WebElement Ancestors = driver.findElement(By.xpath("//div[@class='Mammal']/ancestor::div"));
        String Text_1 = Ancestors.getText();
        System.out.println("Text_1 : " + Text_1);

        // Child -> print First Child
        WebElement Child = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/child::div"));
        String Text_2 = Child.getText();
        System.out.println("Text 2 : " + Text_2);

        // Following-sibling -> After me
        WebElement Following_Sibling = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/following-sibling::div"));
        String Text_3 = Following_Sibling.getText();
        System.out.println("Text 3 : " + Text_3);

        // Preceding-sibling -> Before me
        WebElement Preceding_sibling = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/preceding-sibling::div"));
        String Text_4 = Preceding_sibling.getText();
        System.out.println("Text 4 : " + Text_4);

        // Descendant -> Children to children
        WebElement Descendant = driver.findElement(By.xpath("//div[@class=\"Mammal\"]/descendant::div"));
        String Text_5 = Descendant.getText();
        System.out.println("Text 5 : " + Text_5);

        driver.quit();
        System.out.println("Completed");

    }
}
