package Avoxi.suite.pages.avoxidotcom;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;


@DefaultUrl("https://shoppingcart-staging.avoxi.io")
public class avoxidotcom extends PageObject {

    @FindBy(name="country")
    private WebElement countryName;

    @FindBy(name="numberType")
    private WebElement numberType;

    @FindBy(name="number")
    WebElement phnumber;


    public  void  selectaphonenumber(String country,String numberType,String number )
    {
        getDriver().manage().window().maximize();

        WebElement cntry=getDriver().findElement(By.name("country"));
        Select cntry_Select= new Select(cntry);
        cntry_Select.selectByVisibleText(country);

        WebElement nt=getDriver().findElement(By.name("numberType"));
        Select nt_select= new Select(nt);
        nt_select.selectByVisibleText(numberType);
        waitFor(ExpectedConditions.presenceOfElementLocated(By.name("numberType")));

        try {
            Thread.sleep(20000);
        } catch (Exception e) {
            System.out.println(e);
        }

        WebElement we=getDriver().findElement(By.name("number"));
        Select we_select= new Select(we);
        we_select.selectByIndex(1);
        waitFor(ExpectedConditions.presenceOfElementLocated(By.name("number")));

        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(0,650)", "");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void selectaplan() {
        getDriver().switchTo().defaultContent();

        WebElement submit = getDriver().findElement(By.cssSelector("#businessStandardButton > .\\_1Hjhzm2RDqlKuPvKKeQdYH"));

        Scroll.to(submit);

        submit.click();

        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(0,350)", "");



        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }



    public void completeInfo(String fname, String lname, String bname, String bemail){
        getDriver().switchTo().defaultContent();
        WebElement f_name=getDriver().findElement(By.id("firstName"));
        f_name.sendKeys(fname);

        WebElement l_name=getDriver().findElement(By.id("lastName"));
        l_name.sendKeys(lname);

        WebElement b_name=getDriver().findElement(By.id("businessName"));
        b_name.sendKeys(bname);

        WebElement b_email=getDriver().findElement(By.id("email"));
        b_email.sendKeys(bemail);

        WebElement continu = getDriver().findElement(By.cssSelector(".\\_3kZozxGKwcVv7LzuDb4Qeq"));
        continu.click();

    }

    public void creditInfo(String nameoncard, String cnumber, String edate, String cvv){

        getDriver().switchTo().defaultContent();
        WebElement nameon_card=getDriver().findElement(By.cssSelector(".ant-form > .ant-row:nth-child(1) .ant-input"));
        nameon_card.sendKeys(nameoncard);

        WebElement c_number=getDriver().findElement(By.cssSelector(".ant-form > .ant-row:nth-child(2) .ant-input"));
        c_number.sendKeys(cnumber);

        WebElement e_date=getDriver().findElement(By.cssSelector(".ant-form-item-children > .ant-row:nth-child(1) .ant-input"));
        e_date.sendKeys(edate);

        WebElement c_security=getDriver().findElement(By.cssSelector(".ant-form-item-children > .ant-row:nth-child(2) .ant-input"));
        c_security.sendKeys(cvv);

        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(0,400)", "");


        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        WebElement c_terms=getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]"));
        c_terms.click();

        WebElement submit=getDriver().findElement(By.cssSelector("#placeOrder"));
        submit.click();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }


    }



}
