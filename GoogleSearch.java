package com.ibm.seleniumtraining;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChitradeepChakrabort\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	
/*	List<WebElement> a = driver.findElements(By.tagName("input"));
	
	
	a.get(0).sendKeys("BP");
	a.get(1).sendKeys("abc");
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	
	String b=driver.findElement(By.id("error")).getText();
	
	System.out.print("Error message is"+ b);*/
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
    Thread.sleep(5000);
    
    //.....To take Screenshot.........//
    
    
   /* driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sourav");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
    
    
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);*/
    // Now you can do whatever you need to do with it, for example copy somewhere
    /*try {
        FileUtils.copyFile(scrFile, new File("./ScreenShot/screenshot.png"));
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }*/
	
    //.............Radio Button..................//
    List<WebElement> a = driver.findElements(By.name("sex"));
    Boolean temp = a.get(0).isSelected();
    System.out.println(temp);
    a.get(0).click();
    temp = a.get(1).isSelected();
    System.out.println(temp);
    
    //............Combo Box.............//
    
    Select birthday=new Select(driver.findElement(By.name("birthday_day")));
    birthday.selectByVisibleText("6");
    
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
	
	driver.quit();

	}

}
