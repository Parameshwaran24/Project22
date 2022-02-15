package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jega\\eclipse-workspace\\Selenium Day3\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		// to max the windows
		driver.manage().window().maximize();
		
		// To enter value in user
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Hi Jaga");
		
		// to enter the value in pass by x path
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("thankyou");
	
		//to chick the chick button using X path
		WebElement clickbtn = driver.findElement(By.xpath("//button[@name='login']"));
		clickbtn.click();
		
		
	}

}
