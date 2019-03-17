package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// get the AUT url
		driver.get("https://www.facebook.com/");
		// using id locator
		driver.findElement(By.id("u_0_c")).sendKeys("kannappan");
		driver.findElement(By.id("u_0_e")).sendKeys("vellayappan");
		// using name locator
		driver.findElement(By.name("reg_email__")).sendKeys("0123456789");
		// using class locator
		driver.findElement(By.className("inputtext")).sendKeys("kannappan");
		driver.findElement(By.className("inputtext")).sendKeys("vellayappan");
		// using linktext locator
		// using partial linktext locator
		// using css locator
		// using tagname locator
		// using xpath locator
	}

}
