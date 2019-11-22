package seleniumToool;
//typing java and print all the suggestions in the console.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement email = driver.findElement(By.name("q"));
		email.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> name = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		for (WebElement sugg : name) {
			System.out.println(sugg.getText());
		}
	}
}
