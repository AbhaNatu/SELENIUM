package seleniumToool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch7 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement email=driver.findElement(By.id("login"));
		email.click();
		Thread.sleep(2000);
		driver.findElement(By.id("signup-quick"));
		Thread.sleep(2000);     
		//WebElement //email1;
		//email1.click();
	
	}
}
