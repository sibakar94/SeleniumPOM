package com.qa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	WebDriver driver;
	public void invoke() {
		try {
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("");
			driver.findElement(By.id("email")).sendKeys("");
			WebElement password=driver.findElement(By.id("pass"));
			password.sendKeys("");
			String pass=password.getAttribute("value");
			String text=password.getText();
			System.out.println(pass+text);
			driver.findElement(By.id("loginbutton")).click();
			//get all links
			List<WebElement> allink=driver.findElements(By.tagName("a"));
			System.out.println(allink.size());
			for(WebElement i:allink) {
				System.out.println(i.getText()+"---"+i.getAttribute("href"));
			}
			//get all elements
			List<WebElement> elements=driver.findElements(By.cssSelector("*"));
			System.out.println(elements.size());
			for(WebElement i:elements) {
				System.out.println(i.getText());
			}
			driver.close();
		}catch(Exception e){
			e.printStackTrace();
		};
	}
	public static void main(String[] args) {
		Facebook f=new Facebook();
		f.invoke();
	}

}
