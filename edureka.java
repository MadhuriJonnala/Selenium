import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class edureka {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jonnala\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co/");
		
		String script = "var callback = arguments[arguments.length - 1];"  +
                "getResult(callback)";

         Object result = ((JavascriptExecutor)driver).executeAsyncScript(script, "");

        System.out.println(result);
		
		
		
		
		 
		
		 
	}
}
