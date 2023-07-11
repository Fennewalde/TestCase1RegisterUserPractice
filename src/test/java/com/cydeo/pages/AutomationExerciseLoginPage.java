package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseLoginPage {

    public AutomationExerciseLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignUp_Text;

    @FindBy (xpath = "//input[@data-qa='signup-name']")
    public WebElement newUserNameSignUp;

    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement newUserEmailSignUp;

    @FindBy (xpath = "//button[@data-qa='signup-button']")
    public WebElement newUserSignUpButton;

}
