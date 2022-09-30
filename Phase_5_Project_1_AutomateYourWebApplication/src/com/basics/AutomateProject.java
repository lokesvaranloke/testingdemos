package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateProject {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\loke\\tools\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.simplilearn.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.className("login")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("user_login")).sendKeys("maxuser@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.name("user_pwd")).sendKeys("Maxuser@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btn_login']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".link1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@type='button']")).click();  
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name*']")).sendKeys("Max");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name*']")).sendKeys("User");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("maxuser@gmail.com");
		
		Thread.sleep(2000);
		Select se = new Select(driver.findElement(By.xpath("//select[@id='country_code']")));
		se.selectByVisibleText("IN   -   India");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number*']")).sendKeys("9999999999");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Maxuser@123");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='form-input'] span:nth-child(1)")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='btn_register'])[1]")).click();
		
	}
}
