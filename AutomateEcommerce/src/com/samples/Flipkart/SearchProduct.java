package com.samples.Flipkart;


import java.util.concurrent.TimeUnit;

import org.checkerframework.common.value.qual.IntVal;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class SearchProduct {
	
	WebDriver wd;
	
	@BeforeClass
	public void startBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Tools\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
//		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void searchProduct() throws InterruptedException {
		wd.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(2000);
		wd.findElement(By.linkText("Mobiles & Tablets")).click();
		Thread.sleep(2000);
		WebElement searchItem = wd.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		searchItem.sendKeys("Iphone 13");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement load =   wd.findElement(By.xpath("//*[text()='APPLE iPhone 13 (Midnight, 256 GB)']"));
		Thread.sleep(2000);
		long start = System.currentTimeMillis();
		load.click();
		long finish = System.currentTimeMillis();
		long totalTime = finish-start;
		System.out.println("\nTime taken to load pages = "+totalTime + " milliseconds");
	}
	
	@Test(priority = 2)
	public void loadImage() throws InterruptedException {
		Thread.sleep(5000);
		wd.get("https://www.flipkart.com/apple-iphone-13-midnight-256-gb/p/itmfa27e6497b641?pid=MOBG6VF5AJGQ6HHE&lid=LSTMOBG6VF5AJGQ6HHEIDDQMK&marketplace=FLIPKART&q=Iphone+13&store=tyy%2F4io&srno=s_1_7&otracker=search&otracker1=search&fm=organic&iid=ef9c90fc-e414-48ea-8900-37280f135060.MOBG6VF5AJGQ6HHE.SEARCH&ppt=clp&ppn=mobile-phones-big-diwali-sale22-987gh-87uk-store&ssid=evzj6rxos00000001665482585587&qH=011b952b9e781a2a");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		WebElement image=  wd.findElement(By.cssSelector("div[class='CXW8mj _3nMexc'] img[alt='APPLE iPhone 13 (Midnight, 256 GB)']"));
		
		if(image.isDisplayed()) {
			System.out.println("\nImage loaded Successfully");
		} else {
			System.out.println("\nImage not Loaded");
		}
	}
	
	@Test(priority = 3)
	public void scrollPage() throws InterruptedException {
		Thread.sleep(2000);
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) wd;
		
		WebElement toBottom=  wd.findElement(By.xpath("//div[@class='_2uz0vJ']"));
		js.executeScript("arguments[0].scrollIntoView();", toBottom);
		System.out.println("\n Now scrolled to the bottom of the page ----> Footer");
		Thread.sleep(2000);
		System.out.println("\n Navigation to bottom of page is working");
		System.out.println("\n Page scroll is working");
	}
	
	@Test(priority = 4)
	public void scrollPageFrequency() throws InterruptedException {
		Thread.sleep(2000);
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		
		long start = System.currentTimeMillis();
		
		WebElement toBottom=  wd.findElement(By.xpath("//div[@class='_2uz0vJ']"));
		js.executeScript("arguments[0].scrollIntoView();", toBottom);
		long finish = System.currentTimeMillis();
		
		long totalFrequency = finish - start;
		System.out.println("\n Scroll Frequency = "+totalFrequency + " milliseconds");
	}
	
	@Test(priority = 5)
	public void downloadBeforeScroll() throws InterruptedException {
		Thread.sleep(2000);
		wd.get("https://www.flipkart.com/search?q=laptop&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		
		boolean isDownloaded1 = wd.findElement(By.xpath("//div[contains(text(),'ASUS VivoBook 15 (2022) Core i3 10th Gen - (8 GB/5')]")).isDisplayed();
		
		if(isDownloaded1) {
			System.out.println("\nImage 1 Downloaded");
		} else {
			System.out.println("\nImage 1 Not Downloaded");
		}
		
		boolean isDownloaded2 = wd.findElement(By.xpath("//div[contains(text(),'RedmiBook 15 Core i3 11th Gen - (8 GB/256 GB SSD/W')]")).isDisplayed();
		if(isDownloaded2) {
			System.out.println("\nImage 2 Downloaded");
		} else {
			System.out.println("\nImage 2 Not Downloaded");
		}
		
		Thread.sleep(2000);
		WebElement element = wd.findElement(By.xpath("//div[contains(text(),'ASUS Vivobook S14 OLED (2022) Intel EVO Core i5 12')]"));
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("\nNow scrolled to bottom of page");
	}
	
	@Test(priority = 6)
	public void screenResolution() throws InterruptedException {
		Thread.sleep(2000);
		Dimension dem1 = new Dimension(480, 320);
		wd.manage().window().setSize(dem1);
		Thread.sleep(3000);
		
		Dimension dem2 = new Dimension(1440, 900);
		wd.manage().window().setSize(dem2);
		Thread.sleep(3000);
		
		Dimension dem3 = new Dimension(2880, 1800);
		wd.manage().window().setSize(dem2);
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		int height = ((Number) js.executeScript("return window.innerHeight")).intValue();
		int width = ((Number) js.executeScript("return window.innerWidth")).intValue();
		System.out.println("\n Height = "+ height+ " Width = "+width);
	}
}
