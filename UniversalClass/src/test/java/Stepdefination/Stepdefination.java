package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.Forgotpassword;
import PageObject.InValidSubscribe;
import PageObject.InvalidSignIn;
import PageObject.SearchPage;
import PageObject.SignIn;
import PageObject.Subscribe;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination {
	
  WebDriver driver;
  SignIn signin=new SignIn(driver);
  Subscribe subscribe=new Subscribe(driver);
  InvalidSignIn invalidsignin=new InvalidSignIn(driver);
  InValidSubscribe invalidsubscribe=new InValidSubscribe(driver);
  Forgotpassword fp=new Forgotpassword(driver);
  SearchPage sp=new SearchPage(driver);
  @Given("^user navigates to website$")
  public void user_navigates_to_website() throws Throwable {
      
  }

  @When("^user clicks on Sign In$")
  public void user_clicks_on_sign_in() throws Throwable {
	 //open the browser 
	 signin.main();
	 //click for signin
     signin.click_on_SignIn() ;
  }

  @Then("^successful Sign In is done$")
  public void successful_sign_in_is_done() throws Throwable {
     //System.out.println("Successful sign in");
     signin.close();
  }

  @And("^clicks on Sign In$")
  public void clicks_on_sign_in() throws Throwable {
	  //enter details
	  signin.enter_detail();
      //click on signin
	  signin.Sign_in();
  }
  
  @When("^user clicks on Sign In button$")
  public void user_clicks_on_sign_in_button() throws Throwable {
     //main browser
	invalidsignin.main();
	 //user click on signin 
	invalidsignin.click_on_SignIn();
     
  }

  @Then("^user is not able to Sign In$")
  public void user_is_not_able_to_sign_in() throws Throwable {
     //print error message
     invalidsignin.errormessage();
     //close browser
     invalidsignin.close();
   
     
  }

  @And("^enter invalid Email and Password$")
  public void enter_invalid_email_and_password() throws Throwable {
      // user enter invalid or wrong credentials
	invalidsignin.invalid_data();
  }

  @And("^clicks on Sign In button$")
  public void clicks_on_sign_in_button() throws Throwable {
     //click on signin
	invalidsignin.check_sigin();
  }

  @When("^enter correct Email and Password$")
  public void enter_correct_Email_and_Password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
  }
  @When("^user clicks on Subscribe$")
  public void user_clicks_on_subscribe() throws Throwable {
      //open browser
	  //subscribe.main();
  }

  @Then("^successful SignUp is done$")
  public void successful_signup_is_done() throws Throwable {
     // System.out.println("Succesfully sign up");
  }

  @And("^select desired course$")
  public void select_desired_course() throws Throwable {
      //choose course
	 // subscribe.choose_course();
  }

  @And("^user enters (.+)$")
  public void user_enters(String firstname) throws Throwable {
     //enter fname
	// subscribe.fname("Anshula");
  } 
  @And("^enters (.+)$")
  public void enters(String lastname) throws Throwable {
	//enter lname
	//subscribe.lname("Tripathi");
  }



  @And("^check the checkbox$")
  public void check_the_checkbox() throws Throwable {
     //check the checkbox
	// subscribe.checkbox();
  }

  @And("^clicks on SignUp$")
  public void clicks_on_signup() throws Throwable {
     //click on sigup
	///subscribe.signup();
	//close browser
	//subscribe.close();
  }

  @And("^user enter invalid details$")
  public void user_enter_invalid_details() throws Throwable {
	  //open browser
	  invalidsubscribe.main();
	  //click on subscribe
	  invalidsubscribe.Sub();
	  //choose course
	  invalidsubscribe.choose_course();
	  //enter fname empty
	  invalidsubscribe.fname();
	  //enter lname empty
	  //invalidsubscribe.lname();
	  //enter invalid email id or password
	  //invalidsubscribe.email();
	  //user has not checked the checkbox
	  // invalidsubscribe.checkbox();
	  //eneter nothing
	  //invalidsubscribe.signup();
	 //close browser
	  invalidsubscribe.close();
	
	  
  }

  @Given("^User should be on home page$")
  public void user_should_be_on_home_page() throws Throwable {
	  //open the browser
	  fp.launch();
	  System.out.println("User is on Home page");
      fp.gettitle();
  }

  @When("^User open sign in function$")
  public void user_open_sign_in_function() throws Throwable {
	  //user select signin
	  fp.select();
      fp.gettitle1();
  }
  

  @When("^User enter valid email$")
  public void user_enter_valid_email() throws Throwable {
	  //if mail id is valid
	  fp.validmailid();
  }

  @When("^User enter invalid email$")
  public void user_enter_invalid_email() throws Throwable {
	 //if mail id is invalid
	  fp.invalidmail();
  }

  @Then("^Forgot passsword page opens$")
  public void forgot_passsword_page_opens() throws Throwable {
	 System.out.println("Forgot password page opens");
  }

  @Then("^Mail for reset password is received$")
  public void mail_for_reset_password_is_received() throws Throwable {
	 System.out.println("Mail sent");
  }

  @Then("^Error message should be displayed for it$")
  public void error_message_should_be_displayed_for_it() throws Throwable {
	  //user get error message
	  fp.errormsg();
	  //close browser
	  fp.close();
  }

  @And("^Selects the forgot password$")
  public void selects_the_forgot_password() throws Throwable {
     
  }

  @And("^Click on reset password button$")
  public void click_on_reset_password_button() throws Throwable {
      
  }

  
  @When("^uncheck the checkbox$")
  public void uncheck_the_checkbox() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      
  }

  @Then("^user is not able to SignUp$")
  public void user_is_not_able_to_SignUp() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      
  }

  @When("^clicks on SignUp button$")
  public void clicks_on_SignUp_button() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      
  }

  @When("^user enter course in search box$")
  public void user_enter_course_in_search_box() throws Throwable {
	  //open browser
	  sp.load_browser();
	  //user enter course in search box
	  sp.searchBox();
      System.out.println("user enter course in search box");
  }

  @When("^user enter course in search box by after clicking browse course$")
  public void user_enter_course_in_search_box_by_after_clicking_browse_course() throws Throwable {
	  //open browser
	  sp.load_browser();
	  //search course
	  sp.browse_course();
      System.out.println("user enter course in search box using browse course");
  }

  @When("^user enter random data or unavailable course$")
  public void user_enter_random_data_or_unavailable_course() throws Throwable {
	  //open browser
	  sp.load_browser();
	  //unavailable courses
	  sp.uvavailable_Course();
      System.out.println("user enter unavailable courses");
  }

  @Then("^user can see the related course$")
  public void user_can_see_the_related_course() throws Throwable {
	  System.out.println("User can see the course");
  }

  @Then("^user can see the available course$")
  public void user_can_see_the_available_course() throws Throwable {
	  System.out.println("User can see the availabe course");
	  sp.close();
  }

  @Then("^user can not see the courses$")
  public void user_can_not_see_the_courses() throws Throwable {
	 System.out.println("No records matched your search criteria");
	 //close browser
	 sp.close();
  }

@Then("^user is not able to SignUpg$")
public void user_is_not_able_to_SignUpg() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
}


}
