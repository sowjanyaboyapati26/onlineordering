package Avoxi.suite.step_definitions;

import Avoxi.suite.steps.OnlineOrderingSteps;
import cucumber.api.java.en.Given;

public class OnlineOrdering {

    @Given("^I Am on avoxi website phone number selection page$")
    public void iAmonavoxiwebsitephonenumberselectionpage()
    {
        System.out.println("in onlineordering.java");
        OnlineOrderingSteps.NavigateToOrderingPage();
    }
}
