 package seleniumToool;
 
 //passing id and password for gmail
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DemoLaunch1 {
			
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com/");
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("aliabhatt@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		WebElement pas=driver.findElement(By.name("password"));
		pas.sendKeys("ranbir",Keys.ENTER);
		//WebElement log=driver.findElement(By.id("loginbutton"));
		//log.click();
		}

	}



