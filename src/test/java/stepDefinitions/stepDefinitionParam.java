package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import base.base;
import io.cucumber.junit.Cucumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.PortalHomePage;


@RunWith(Cucumber.class)

public class stepDefinitionParam extends base {

    public static Logger log = LogManager.getLogger(base.class.getName());



        @Given("^Open the browser with chrome$")
        public void open_the_browser_with_chrome() throws Throwable {
         //   Thread.sleep(40000);
            driver = initializeDriver();
            log.info("Opened browser");

        }

        @When("^The user enters (.+) and (.+) and logs in$")
        public void the_user_enters_and_and_logs_in(String username, String password) throws Throwable {
            LoginPage lp = new LoginPage(driver);
            lp.getEmail().sendKeys(username);
            lp.getPassword().sendKeys(password);
            lp.getLogin().click();
            log.info("Yes, it's logged in");
        }

        @Then("^make sure the user is successfully logged in$")
        public void make_sure_the_user_is_successfully_logged_in() throws Throwable {
            PortalHomePage php = new PortalHomePage(driver);
            Assert.assertTrue(php.getSearchbox().isDisplayed());

        }

        @And("^Go to \"([^\"]*)\" Site$")
        public void go_to_something_site(String strArg1) throws Throwable {
            driver.get(strArg1);

        }

        @And("^Click on the home link in main page$")
        public void click_on_the_home_link_in_main_page() throws Throwable {
               MainPage mp = new MainPage(driver);
             if (mp.getPopUpSize()>0){
                 mp.getPopUp().click();
             }
               mp.getHome().click();


        }

        @And("^click on login button in home page$")
        public void click_on_login_button_in_home_page() throws Throwable {
         HomePage hp = new HomePage(driver);
         hp.getLogin().click();

        }

        @And("^close browsers$")
        public void close_browsers() throws Throwable {
             driver.quit();

        }



}

