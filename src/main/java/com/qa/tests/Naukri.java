package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {

	WebDriver driver;
	public void invoke() {
		try {
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");//change path of driver file
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.naukri.com/nlogin/logout");
			driver.findElement(By.id("usernameField")).sendKeys("");//change email id
			driver.findElement(By.id("passwordField")).sendKeys("");//change password
			driver.findElement(By.xpath("//button")).click();
			WebElement element=driver.findElement(By.xpath("//div[@class='mTxt' and text()='My Naukri']"));
			Actions action=new Actions(driver);
			action.moveToElement(element).perform();
			driver.findElement(By.cssSelector("a[title='Edit Profile']")).click();
			driver.findElement(By.id("attachCV")).sendKeys("");//path of cv
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		Naukri n=new Naukri();
		n.invoke();
	}
}
