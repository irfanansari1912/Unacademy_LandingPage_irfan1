package com.pages;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.ExcelReader;
import com.utility.Utility;
public class LoginPage  extends Utility{
	public LandingPage ldp;
	ExcelReader reader;
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		

		
	}
	@FindBy(name="mobile number")

    WebElement mobilenumber;  

    

    @FindBy(name="otp")

    WebElement otp;

    

    @FindBy(xpath="//*[@class=' e52pvpx3 css-1dk3nw2-StyledButton-VerifyButton e1wp3nh0']")

    WebElement verifyotp;

    public LoginPage() throws IOException

    {

        SearchContext driver = null;
		PageFactory.initElements(driver, this);

    }

    public String validateLoginPageTitle()

    {

       return validateLoginPageTitle();

    }

    public void loginmobilenumber(String mn) {

        mobilenumber.sendKeys(mn);

    }

    public void loginotp(String ot) {

        otp.sendKeys(ot);

    }    

//    public HomePage verifyotp() throws IOException {
//
//        verifyotp.click();
//
//        return new HomePage();
//
//    }    

    

 

}

