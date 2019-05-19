package Avoxi.suite.runners;


import Avoxi.suite.steps.OnlineOrderingSteps;
import org.junit.Test;


@org.junit.runner.RunWith(net.serenitybdd.cucumber.CucumberWithSerenity.class)
    @cucumber.api.CucumberOptions(features = {"src/test/resources/features/PhoneNumberPurchase.feature"}
    , glue = {"suite.step_definitions.OnlineOrdering"})

    public class PhoneNumberPurchase {


    }
