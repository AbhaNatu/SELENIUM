package seleniumToool;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();//closing the pop up
		//email.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		//driver.findElement(By.xpath(xpathExpression))
		//WebElement dining=driver.findElement(By.xpath("//li[@class=\'topnav_item diningunit\']"));//displaying dining in the search bar
		//System.out.println(dining.getText());
		//WebElement sale=driver.findElement(By.xpath("//li[@class=\"topnav_item saleunit\"]"));//displaying sale in the search bar
		//System.out.println(sale.getText());
	   List<WebElement> body=driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));//displaying all the body from sale to collections in console
	   for(WebElement name:body)
	   {
		   System.out.println(name.getText());   
	   }
	  /*System.out.println(body.getText());
	   WebElement search=driver.findElement(By.id("search"));
	   Thread.sleep(2000);
	   search.sendKeys(sale.getText());*/
	   
	}	
}
  