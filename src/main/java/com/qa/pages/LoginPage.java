package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

    public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
    //Set user name 

    public void setUserName(String userName){

        driver.findElement(By.id("identifierId")).sendKeys(userName);

    }
    
    //Click loginNext
    
    public void loginNext(){

        driver.findElement(By.id("identifierNext")).click();

    }

    //Set password

    public void setPassword(String password){

         driver.findElement(By.name("password")).sendKeys(password);

    }

    //Click on login button

    public void clickLogin(){

         driver.findElement(By.id("passwordNext")).click();

    }

    public void loginToGmail(String userName,String password){

        this.setUserName(userName);
        this.loginNext();
        this.setPassword(password);
        this.clickLogin();        
    }
}
