package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {


    @Given("{int} integer no")
    public void integer_no(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       System.out.println(" this is from given");
    }
    @When("add {string} with {string}")
    public void add_with(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" this is from when");
    }
    @Then("result is {string}")
    public void result_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" this is from then");
    }


}
