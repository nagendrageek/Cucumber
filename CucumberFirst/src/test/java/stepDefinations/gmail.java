package stepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;

import First.CucumberFirst.LoginObjects;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import resources.base;

public class gmail extends base{
	public WebDriver driver;
	LoginObjects log;
	@Given("^Login Page$")
    public void login_page() {
		driver=initializedriver();
		driver.get(prop.getProperty("url"));
        
    }

  /*  @When("^User cliked on submit button by providing (.+) and (.+)$")
    public void user_cliked_on_submit_button_by_providing_and(String userid, String password) {
    	log=new LoginObjects(driver);
		log.Email().sendKeys(userid);
		log.Nextbutton().click();
		log.password().sendKeys(password);
		log.Next().click();
    }*/
	
	 @When("^User cliked on submit button by providing userid and password$")
    public void user_cliked_on_submit_button_by_providing_and(DataTable credentials) {
		 List<List<String>> c= credentials.raw();
    	log=new LoginObjects(driver);
		log.Email().sendKeys(c.get(0).get(0));
		log.Nextbutton().click();
		log.password().sendKeys(c.get(0).get(1));
		log.Next().click();
    }

    @Then("^Application Home Page is displayed$")
    public void application_home_page_is_displayed()  {
    	if(log.Home()>0)
        {
        	System.out.println("Sucess");;
        }
    }

    @And("^able to do another transcation from this screen$")
    public void able_to_do_another_transcation_from_this_screen()  {
    	 driver.close();
			driver=null;
    }

}
