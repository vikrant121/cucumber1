package testcase;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Amazonusertest extends Hook
{
	
	public static boolean user = false;
	
	@Given("browser {string} us open with url {string}")
	public void browser_us_open_with_url(String browser, String url) throws Exception 
	{
	    openBrowser(browser,url);
	    utility.Exentreport.generateReport("Amazonlogin");
	    utility.Exentreport.test.log(LogStatus.PASS, "Website open");
	}
	@Given("I click sign in")
	public void i_click_sign_in() 
	{
		signin.click();
//	signin.click();
	}
	@When("I enter valid userid {string}")
	public void i_enter_valid_userid(String userid) throws Exception 
	{
	    uid.sendKeys(userid);
//	    utility.ScreenShot.takeScreenShot("img1");
	}
	@When("Click continue button")
	public void click_continue_button()
	{
	     ctnbtn.click();
	}
	@Then("I Validate the userid")
	public void i_validate_the_userid() throws Exception 
	{
		try {
			 utility.Exentreport.test.log(LogStatus.INFO, err1.getText());
		}
		catch(Exception e)
		{
			user = true;
			 utility.Exentreport.test.log(LogStatus.INFO,"Valid User id");
		}
	   utility.Exentreport.endReport();
	   
	}
	
//	@And("Close Browser")
//	public void Close_Browser() throws Exception 
//	{
	//closeBrowser();
//	}
	
}
