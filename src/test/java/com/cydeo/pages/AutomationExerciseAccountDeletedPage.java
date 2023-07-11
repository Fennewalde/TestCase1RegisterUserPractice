package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseAccountDeletedPage {

    public AutomationExerciseAccountDeletedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//h2[@data-qa='account-deleted']")
    public WebElement accountDeletedVerificationText;

    @FindBy (xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

}
