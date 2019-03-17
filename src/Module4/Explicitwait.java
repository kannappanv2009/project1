package Module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
	WebDriverWait wait = new WebDriverWait(driver,25);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5")));
	
	
	}

}
