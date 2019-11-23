
package seleniumToool;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("shirt",Keys.ENTER);
		driver.findElement(By.xpath("//img[@title=\"Roadster Men Blue Regular Fit Printed Casual Shirt\"]")).click();
		Set<String>wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
	driver.findElement(By.xpath("//span[@class=\'myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center\']")).click();
	WebElement txt=driver.findElement(By.xpath("//span[@class=\'size-buttons-size-error-message\']"));
	System.out.println(txt.getText());
	}
}
