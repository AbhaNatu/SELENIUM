 package seleniumToool;
 //for searching in google search bar
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DemoLaunch2 {
			
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			WebElement email=driver.findElement(By.name("q"));
			email.sendKeys("java",Keys.ENTER);
			WebElement email1=driver.findElement(By.name("btnk"));
			//Thread.sleep(2000);
			//WebElement pas=driver.findElement(By.name("password"));
			//pas.sendKeys("ranbir",Keys.ENTER);
			//WebElement log=driver.findElement(By.id("loginbutton"));
			//log.click();
		}

	}



