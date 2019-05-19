package Avoxi.suite.steps;

import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineOrderingSteps {

public static final String url= "https://shoppingcart-staging.avoxi.io/";

    public static void NavigateToOrderingPage()
    {
        ChromeDriver dr = new ChromeDriver();
        dr.get(url);
    }
}
