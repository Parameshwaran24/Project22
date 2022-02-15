package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jega\\eclipse-workspace\\Selenium Day3\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("mani");
		
		
		WebElement lastname = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		lastname.sendKeys("R");
		
		// to click the check box
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='Male']"));
		checkbox.click();
		
	}

}
