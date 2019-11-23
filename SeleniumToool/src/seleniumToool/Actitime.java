package seleniumToool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String title=driver.getTitle();
		System.out.println(title);
		WebElement email=driver.findElement(By.name("username"));
		email.sendKeys("admin");
		Thread.sleep(2000);
		WebElement email1=driver.findElement(By.name("pwd"));
		email1.sendKeys("manager");
	   WebElement email2=driver.findElement(By.id("loginButton"));
       email2.click();	   
	   Thread.sleep(2000);
	   String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(2000);
		if(title==title1)
		{
			System.out.println("not successful");
		}
		else
			System.out.println("login successfull");
	}
}
