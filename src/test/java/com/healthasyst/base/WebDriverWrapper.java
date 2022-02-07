package com.healthasyst.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWrapper {
	
	public static WebDriver driver;
	


	//runs after every scenario either it is pass or fail
	@After
	
	public void endScenario()
	{
		WebDriverWrapper.driver.quit();
	}
}