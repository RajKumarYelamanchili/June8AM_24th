package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserJune24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
	WebElement dropdown1=	driver.findElement(By.xpath("//select[@name='country']"));
	
	
	Select sel1 = new Select(dropdown1);
	       if (sel1.isMultiple())
	       {
			System.out.println("Country drop down allows multiple selection");
	       } 
	       else
	       {
	    	  
	   		System.out.println("Country drop down does not allow multiple selection");
	   	       
	       }
	 
	 int lstSize =  sel1.getOptions().size();
	 
	 System.out.println("Number of countries: " + lstSize );
	 
	 sel1.selectByIndex(9);
	 String Country1 =    sel1.getFirstSelectedOption().getText();
	 System.out.println("Country chosen: " + Country1 );
		Thread.sleep(2000);
	 
	 sel1.selectByVisibleText("Australia");
	 String Country2 =    sel1.getFirstSelectedOption().getText();
	 System.out.println("Country chosen: " + Country2 );
		Thread.sleep(2000);
	 
	 
	 sel1.selectByValue("BD");
	 String Country3 =    sel1.getFirstSelectedOption().getText();
	 System.out.println("Country chosen: " + Country3 );
		Thread.sleep(2000);

	}

}
