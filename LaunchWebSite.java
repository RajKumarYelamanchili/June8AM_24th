package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebSite {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserJune24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		//driver.findElement(By.id("email")).sendKeys("Rahul@abc.com");
	//	driver.findElement(By.name("email")).sendKeys("virat@pqr.com");
	//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rohit@xyz.com");
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sunil@xyz.com");
		//driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.partialLinkText("ate a Pag")).click();
		
		//driver.close();
		//driver.quit();

	}

}
