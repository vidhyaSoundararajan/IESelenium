import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//static WebDriver driver;
public class demo1 {
	static WebDriver driver;
	public static void main(String[] args) {
	
	System.setProperty("webdriver.ie.driver","C:\\Users\\Nandakumar\\eclipse-workspace\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");          
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
}
