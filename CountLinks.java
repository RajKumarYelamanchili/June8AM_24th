package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.rediff.com");
		Thread.sleep(2000);
		
	List<WebElement> allLinks =	driver.findElements(By.tagName("a"));
	System.out.println("Total number of links: " + allLinks.size());
	
	for(WebElement b : allLinks)
	{
		System.out.println(b.getText());
	}
	

	}

}
