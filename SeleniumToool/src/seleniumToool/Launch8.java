package seleniumToool;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\'_2AkmmA _29YdH8\']")).click();
		Thread.sleep(2000);
		List<WebElement> body=driver.findElements(By.xpath("//ul[@class=\'_114Zhd\']"));//displaying all the body from sale to collections in console
		   for(WebElement name:body)
		   {
			   System.out.println(name.getText());   
		   }
	}
}
