package Avoxi.suite.steps;

import Avoxi.suite.pages.avoxidotcom.avoxidotcom;
import cucumber.api.java.Before;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import Avoxi.suite.utils.initz;
import net.thucydides.core.annotations.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class OnlineOrderingSteps extends PageObject {

avoxidotcom avoxihome;

    @Step
    public void open_home_page() {
        avoxihome.open();
    }


    @Step
    public  void  selectaphonenumber(String country,String numberType,String number )
    {
        avoxihome.selectaphonenumber(country,numberType,number);

    }

    @Step
    public  void  selectaplan( )
    {
        avoxihome.selectaplan();

    }

    @Step
    public  void  completeInfo(String fname,String lname,String bname,String bemail )
    {
        avoxihome.completeInfo(fname, lname, bname, bemail);

    }

    @Step
    public  void  cardInfo(String nameoncard,String cnumber,String expiry,String cvv )
    {
        avoxihome.creditInfo (nameoncard, cnumber, expiry, cvv);

    }

    @Step
    public  void  confirmOrder()
    {
        String a="order";
        //assertThat(selectedType.isPresent()).describedAs("No item type was selected").isTrue();

        String orderconfirm=avoxihome.getDriver().findElement(By.xpath("//p[@class='_1qArq0vK2GWu13OMTHWsa_']")).getText();
        assertThat(orderconfirm, containsString("We’re reviewing your order."));



    }

}
