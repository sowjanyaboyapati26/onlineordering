package Avoxi.suite.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class initz {

    WebDriver driver= new ChromeDriver();
    public  void initialization()
    {
        String url= "https://shoppingcart-staging.avoxi.io";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_64_mac");

        driver.get(url);
    }
}
