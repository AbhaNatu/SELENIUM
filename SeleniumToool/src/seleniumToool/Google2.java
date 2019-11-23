package seleniumToool;
//searching in google search bar and then clearing it and again searching
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement email=driver.findElement(By.name("q"));
		email.sendKeys("java",Keys.ENTER);
	
		WebElement email1=driver.findElement(By.name("q"));
	    email1.clear();
	    Thread.sleep(2000);
	    WebElement email2=driver.findElement(By.name("q"));
		email2.sendKeys("selenium",Keys.ENTER);
		
		driver.navigate().back();
		
				
}
}
