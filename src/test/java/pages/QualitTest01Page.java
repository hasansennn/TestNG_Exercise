package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitTest01Page {

    public QualitTest01Page(){
      PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement accept;

    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement login;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginclick;

    @FindBy(xpath = "(//button[@class='btn'])[2]")
    public WebElement searchBase;
}
