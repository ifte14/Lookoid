import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class RegistrationTest {
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

	public void RegistrationProcess() throws InterruptedException {

	driver.get("https://www.lookoidbd.com/my-account/");

	Thread.sleep(2000);
	driver.manage().window().maximize();

	//Registration Process Starts

	//Input Username

	driver.findElement(By.id("reg_username")).sendKeys("testuser128");

	Thread.sleep(1000);

	//Input Email

	driver.findElement(By.id("reg_email")).sendKeys("testuser158@yopmail.com");

	Thread.sleep(1000);

	//Input Password

	driver.findElement(By.id("reg_password")).sendKeys("testuser1@aiub");

	Thread.sleep(1000);

	//Register Button Click

	driver.findElement(By.xpath("//button[@name='register']")).click();
	

	Thread.sleep(1000);
	// LOg
	driver.findElement(By.xpath("//*[@id=\"post-13\"]/div/nav/ul/li[7]/a")).click();
	

	Thread.sleep(3000);
	
	
	}

	@AfterTest

	public void tearDownTest() {

	driver.close();


	driver.quit();


	}
}
