package com.gre;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company {
	
	
	
	public static void main(String[] args) throws IOException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("chennai");
		driver.findElement(By.id("dest")).sendKeys("banglore");
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
//		TakesScreenshot screen=(TakesScreenshot) driver;
//		File s = screen.getScreenshotAs(OutputType.FILE);
//		File d=new File("C:\\Users\\lakshman\\Desktop\\gitclass\\ran.png");
//		
//		FileUtils.copyFile(s, d);
		
		
		
	}
}
