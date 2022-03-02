package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
	public void OpenApplication(){
	// reusable functions	
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
	}
	public void CloseApplication() {
		driver.close();
		System.out.println("Application Closed");
	}
	public void login() {
	    driver.findElement(By.name(txt_loginname)).sendKeys(un);
	    driver.findElement(By.name(txt_password)).sendKeys(pw);
	    driver.findElement(By.name(btn_login)).click();
	    System.out.println("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Successffull");
	}
	public void enterFrame() {
		driver.switchTo().frame(frame);
		System.out.println("enter into frame");
	}
	public void newEmpAdd() throws Exception {
		driver.findElement(By.xpath(btn_add)).click();
		System.out.println("Clicked on add button");
		Thread.sleep(3000); 
		driver.findElement(By.name(first_name)).sendKeys(Fn);
		driver.findElement(By.name(last_name)).sendKeys(Ln); 
		driver.findElement(By.id(btn_save)).click();
		Thread.sleep(3000);
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit into frame");
	}
	public void delEmp() {
		System.out.println("Employee Deleted");
	}	
}