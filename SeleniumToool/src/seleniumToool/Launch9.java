package seleniumToool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement email=driver.findElement(By.name("q"));
	email.sendKeys("java",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@id=\'dimg_33\']")).click();
	}

}
