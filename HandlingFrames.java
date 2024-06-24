package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserJune24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		Thread.sleep(2000);
		
	//WebElement     frame1  =  driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
	//Thread.sleep(2000);
//	1st way
//	driver.switchTo().frame(frame1);
		
	//	2nd way
	//	driver.switchTo().frame(0);
		
		//3rd way
		driver.switchTo().frame("iframe_a");
	
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@itemprop='query-input']")).sendKeys("Selenium Jobs");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='wpb_button wpb_btn-inverse btn']")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	

		

	}

}
