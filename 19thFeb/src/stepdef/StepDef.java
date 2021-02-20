package stepdef;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.TestPage;

public class StepDef {

	TestPage tpage;

//Arrival
	@Given("^This is the Home page$")
	public void this_is_the_Home_page() throws Throwable {
		tpage = new TestPage();
	}

	@When("^Click on that shop button$")
	public void click_on_that_shop_button() throws Throwable {
		tpage.click1();
	}

	@Then("^After that click on home btn$")
	public void after_that_click_on_home_btn() throws Throwable {
		tpage.click2();
	}

//	
//Slide
	@Then("^count of slide$")
	public void count_of_slide() throws Throwable {
		int count =tpage.slider.size();
	    Assert.assertEquals(3,count);
	    System.out.println(tpage.slider.size());
//	    
	}
	
//navigate to basket page
	@Then("^link on Firstlink$")
	public void link_on_Firstlink() throws Throwable {
		tpage.click3();
	}

	@Then("^click on basket button$")
	public void click_on_basket_button() throws Throwable {
		tpage.Add_in_basket();
	}

	// Description
	@Then("^click on description$")
	public void click_on_description() throws Throwable {
		tpage.description();

	}

	// Reviews
	@Then("^click on reviews$")
	public void click_on_reviews() throws Throwable {
		tpage.reviews();
	}

}
