package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseAccountCreatedPage {

    public AutomationExerciseAccountCreatedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//h2[.='Account Created!']")
    public WebElement accountCreatedTextVerification;

    @FindBy (xpath = "//a[@data-qa='continue-button']")
    public WebElement accountCreatedContinueButton;

    @FindBy (xpath = "//iframe[@id='aswift_1']")
    public WebElement iframe;

    @FindBy (xpath = "//div[@aria-label='Close ad']")
    public WebElement iframeCloseButton;

}
