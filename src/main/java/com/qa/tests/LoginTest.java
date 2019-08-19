package com.qa.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	
	public void invokeBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://mail.google.com/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testLoginPage() {
		
		try {
			invokeBrowser();
			LoginPage objLogin=new LoginPage();
			objLogin.setDriver(driver);
			//login to gmail
			objLogin.loginToGmail("<email id>","<password>");//enter your gmail id and password
			//return homepagetitle
			Thread.sleep(5000);
			HomePage objHome=new HomePage();
			objHome.setDriver(driver);
			System.out.println(objHome.homePageTitle());
			
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		LoginTest l=new LoginTest();
		l.testLoginPage();
	}
}
