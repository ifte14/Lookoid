import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SearchTest {
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
	//search prod
	driver.findElement(By.xpath("//*[@id=\"menu-item-300\"]/a/span")).click();

	Thread.sleep(1000);
	//search
	driver.findElement(By.xpath("//div[@class='site-tools']/span[1]")).click();

	Thread.sleep(1000);
	//searchbox
	driver.findElement(By.id("woocommerce-product-search-field-3")).sendKeys("Panjabi");

	Thread.sleep(1000);
	//enter
	driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/form/button")).click();

	Thread.sleep(5000);
	}

	@AfterTest

	public void tearDownTest() {

	driver.close();


	driver.quit();


	}
}
