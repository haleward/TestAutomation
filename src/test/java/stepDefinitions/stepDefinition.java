package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

import base.base;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.PortalHomePage;


@RunWith(Cucumber.class)
public class stepDefinition extends base{


    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable{
      driver =  initializeDriver();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String arg1, String arg2) {
        LoginPage lp =new LoginPage(driver);
        lp.getEmail().sendKeys(arg1);
        lp.getPassword().sendKeys(arg2);
        lp.getLogin().click();
    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in(){
        PortalHomePage p = new PortalHomePage(driver);
       Assert.assertTrue( p.getSearchbox().isDisplayed());
    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) {
       driver.get(strArg1);
    }

    @And("^Click on home link in main page$")
    public void click_on_home_link_in_main_page(){
       MainPage mp = new MainPage(driver);
      if( mp.getPopUpSize()> 0){
          mp.getPopUp().click();
      }
       mp.getHome().click();
    }

    @And("^click on login in home page$")
    public void click_on_login_in_home_page(){
    HomePage hp = new HomePage(driver);
    hp.getLogin().click();
    }







}
