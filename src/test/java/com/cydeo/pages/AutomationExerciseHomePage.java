package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseHomePage {

    public AutomationExerciseHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement SignupLoginButton;

    @FindBy (xpath = "//i[@class='fa fa-user']")
    public WebElement loggedInAsText;

    @FindBy (xpath = "//a[.=' Delete Account']")
    public WebElement deleteAccountButton;


}
