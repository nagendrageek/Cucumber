package First.CucumberFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class LoginObjects extends base {
	public WebDriver driver;
	
public  LoginObjects(WebDriver driver) {
	this.driver=driver;
}

By EmailorPhone=By.id("identifierId");
By Nextbutton=By.xpath("//*[@id=\"identifierNext\"]/content/span");
By password=By.name("password");
By Next=By.xpath("//*[@id=\"passwordNext\"]/content/span");
By Home=By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span");

public WebElement Email() {
	return driver.findElement(EmailorPhone);
}

public WebElement Nextbutton() {
	return driver.findElement(Nextbutton);
}


public WebElement password() {
	return driver.findElement(password);
}

public WebElement Next() {
	return driver.findElement(Next);
}

public int Home() {
	return driver.findElements(Home).size();
}

}
