package tests;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitTest01Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class qualityTestttt {
    /*
            1- https://www.qualitydemy.com/ anasayfasina gidin
            2- login linkine basin
            3- Kullanici email'i olarak valid email girin
            4- Kullanici sifresi olarak valid sifre girin
            5- Login butonuna basarak login olun
            6- Basarili olarak giris yapilabildigini test edin

     */
    QualitTest01Page qualitTest01Page=new QualitTest01Page();

    @Test
    public void test01(){
        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitTest01Page.accept.click();
        //  2- login linkine basin
        qualitTest01Page.login.click();
        // 3- Kullanici email'i olarak valid email girin
        qualitTest01Page.email.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
       //  4- Kullanici sifresi olarak valid sifre girin
        qualitTest01Page.password.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        // 5- Login butonuna basarak login olun
        qualitTest01Page.loginclick.click();
        //  6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitTest01Page.searchBase.isDisplayed());
        Driver.closeDriver();

    }



}
