package Avoxi.suite.step_definitions;

import Avoxi.suite.steps.OnlineOrderingSteps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import sun.security.util.PendingException;
import static org.junit.Assert.assertTrue;
import Avoxi.suite.utils.*;


public class OnlineOrdering {
    @Steps
    OnlineOrderingSteps oosteps;

    @Given("^I Am on avoxi website phone number selection page$")
    public void i_Am_on_avoxi_website_phone_number_selection_page() throws Throwable {
       oosteps.open_home_page();
    }

    @When("^I select a \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public  void i_select_a_phonenumber(String country, String numberType, String number) throws Throwable {
        oosteps.selectaphonenumber( country, numberType, number);
    }

    @When("^I select a \"([^\"]*)\"$")
    public void i_select_a(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        oosteps.selectaplan();
    }
    @When("^complete information \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and click continue$")
    public void complete_information_and_click_continue(String fname, String lname, String Bname, String Bemail) {
        // Write code here that turns the phrase above into concrete actions
        oosteps.completeInfo(fname,  lname,  Bname,  Bemail);
    }


    @Then("^I can enter a valid test credit card Payment \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"  and I accept the terms$")
    public void i_can_enter_a_valid_test_credit_card_Payment_and_I_accept_the_terms(String nameoncard, String cnumber, String expiry, String cvv) {
        // Write code here that turns the phrase above into concrete actions
       oosteps.cardInfo(nameoncard,cnumber,expiry,cvv);
    }

    @Then("^Successfully Place the order$")
    public void successfully_Place_the_order() {
        // Write code here that turns the phrase above into concrete actions
       oosteps.confirmOrder();
    }
}
