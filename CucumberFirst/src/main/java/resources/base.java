package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	FileInputStream flc;
	public static Properties prop;
	public WebDriver initializedriver(){
		// TODO Auto-generated method stub
		try {
		FileInputStream flc=new FileInputStream("C:\\Users\\nagen\\eclipse-workspace\\Cocumber\\src\\main\\java\\resources\\input.properties");
       prop=new Properties();
       prop.load(flc);
		}
		catch(IOException E) {
		
		}
String Browsername=prop.getProperty("browser");
if(Browsername.contains("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver=new ChromeDriver();
}
else if(Browsername.contains("ie")) {
	System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
	driver=new ChromeDriver();
}
else{
	System.setProperty("webdriver.firefix.driver", "C://geckodriver.exe");
	driver=new ChromeDriver();
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
	}
	
}
