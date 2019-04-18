package com.Hybrid.hybrid.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "T:\\7-Frameworks\\Hybrid_Framework\\Exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("www.fliplart.com");
	}
}
