import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Log {
	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");

		System.out.println("projectPath : "+projectPath);

		System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.lookoidbd.com/my-account/");

		try {

		Thread.sleep(5000);

		} catch (InterruptedException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}

		driver.close();

		}

}
