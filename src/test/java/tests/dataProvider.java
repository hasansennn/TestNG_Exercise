package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class dataProvider {
    @DataProvider
    public static  Object[][] gonderilecekMail(){

        Object [][] gonderilecekMailvePasword = {{"nevzat","1234"}};
        return gonderilecekMailvePasword;
    }
    @Test(dataProvider = "gonderilecekMail" )
    public void qualityTest(String mail,String password){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

    }

}
