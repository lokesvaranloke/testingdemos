package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
	
	WebDriver wd;

	@BeforeMethod
	public void startBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\loke\\tools\\chromedriver version 106\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.swiggy.com/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void register() throws InterruptedException {
		Thread.sleep(2000);
		wd.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7904121858");
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='name']")).sendKeys("max well");
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='email']")).sendKeys("maxwelluser@gmail.com");
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("Maxwelluser");
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();
	}
	
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		wd.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7904121858");
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//a[@class='a-ayg']")).click();
	}
	
	@Test(priority = 2)
	public void addtocart() throws InterruptedException{
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='location']")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@id='location']")).sendKeys("coimbatore");
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//span[normalize-space()='Coimbatore, Tamil Nadu, India']")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys("Burger");
		
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("div[class='_2NSqs'] button:nth-child(1)")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//div[4]//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//span[@class='_38xdN']")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
	}
	

	
	@AfterMethod
	public void stopBrowser() throws InterruptedException {
		Thread.sleep(5000);
		wd.quit();
	}
}
