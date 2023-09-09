import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ProductOder {
	static WebDriver driver = null;

	@BeforeTest

	public void setUpTest()

	{

	String projectPath = System.getProperty("user.dir");

	System.out.println("projectPath : "+projectPath);

	System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chromedriver.exe");

	driver = new ChromeDriver();

	}


	@Test

	public void SearchProcess() throws InterruptedException {

	driver.get("https://www.lookoidbd.com/my-account/");

	Thread.sleep(2000);

	driver.manage().window().maximize();
	//Input Username

	driver.findElement(By.id("username")).sendKeys("iftee");

	Thread.sleep(1000);

	//Input Password

	driver.findElement(By.id("password")).sendKeys("6655779966");

	Thread.sleep(1000);

	//Login Button Click

	driver.findElement(By.xpath("//button[@name='login']")).click();

	Thread.sleep(1000);
	//shop
	WebElement element = driver.findElement(By.xpath("//*[@id='menu-item-275']/a/span[1]"));

	Actions actions = new Actions(driver);

	actions.moveToElement(element).build().perform();
	Thread.sleep(2000);
	//drop
	driver.findElement(By.xpath("//li[@id='menu-item-276']")).click();

	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/div/div[2]/h2/a")).click();

	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"product-18\"]/div[1]/div/div[3]/div/form/button")).click();

	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"post-11\"]/div/div[2]/div/div/a")).click();

	Thread.sleep(2000);
	
	
	}

	@AfterTest

	public void tearDownTest() {

	driver.close();


	driver.quit();


	}
}
