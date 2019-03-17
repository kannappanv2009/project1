package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.quit();
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Installation Stuff\\Exe Files\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//Close and Quit Commands
		driver.close(); // it will close the current active window in the current session
		driver.quit();//it will close all the windows in the current session
		
		//Get Commands
		driver.get("URL");// this is used to open the URL of AUT
		driver.getCurrentUrl();// this will capture the current URL of that page on which you are at present
		driver.getTitle();//this will capture the current page title.
		driver.getWindowHandle();//this will get me the names of the windows
		
		//Navigation Commands
		driver.navigate().to("String/URL");// this will be used to move toward either an object or towards a 
		driver.navigate().back();// to move to a previous page
		driver.navigate().forward();// to move to the next page (already executed)
		driver.navigate().refresh();// to refresh the page
		
		//Element handling commands
		driver.findElement(By.id("")).clear();//to clear the field
		driver.findElement(By.id("")).clear();//to click on an element
		driver.findElement(By.id("")).sendKeys("kannappan"); // to type on and text box
	}

}
