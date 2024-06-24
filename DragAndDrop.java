package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserJune24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.id("draggable"));
		WebElement drop1 = driver.findElement(By.id("droppable"));
		
		//act.dragAndDrop(drag1, drop1).perform();
		
		act.clickAndHold(drag1).perform();
		act.moveToElement(drop1).perform();
		act.release(drop1).build().perform();
		
		
	}

}
