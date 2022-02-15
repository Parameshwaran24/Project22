package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaContain {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jega\\eclipse-workspace\\Selenium Day3\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement paratxt = driver.findElement(By.xpath("//p[contains(text(), '        Learn ')]"));
		String text = paratxt.getText();
		System.out.println(text);
		
		
	}

}
