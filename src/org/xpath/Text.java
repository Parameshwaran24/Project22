package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jega\\eclipse-workspace\\Selenium Day3\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		// to max the windows
		driver.manage().window().maximize();
		
		WebElement seleniumtext = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));
		String text = seleniumtext.getText();
		System.out.println(text);
	}

}
