package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseSignUpPage {

    public AutomationExerciseSignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@id='id_gender1']")
    public WebElement genderTitleRadioButtonMale;

    @FindBy (xpath = "//input[@id='id_gender2']")
    public WebElement genderTitleRadioButtonFemale;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//select[@data-qa='days']")
    public WebElement dateOfBirthDayDropDown;

    @FindBy (xpath = "//select[@data-qa='months']")
    public WebElement dateOfBirthMonthDropDown;

    @FindBy (xpath = "//select[@data-qa='years']")
    public WebElement dateOfBirthYearDropDown;

    @FindBy (xpath = "//input[@id='newsletter']")
    public WebElement signUpForNewsletterButton;

    @FindBy (xpath = "//input[@id='optin']")
    public WebElement receiveSpecialOffersButton;

    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement addressInputFirstName;

    @FindBy (xpath = "//input[@id='last_name']")
    public WebElement addressInputLastName;

    @FindBy (xpath = "//input[@id='company']")
    public WebElement addressInputCompanyName;

    @FindBy (xpath = "//input[@id='address1']")
    public WebElement addressInputAddressLine1;

    @FindBy (xpath = "//input[@id='address2']")
    public WebElement addressInputAddressLine2;

    @FindBy (xpath = "//select[@id='country']")
    public WebElement addressCountryDropDown;

    @FindBy (xpath = "//input[@id='state']")
    public WebElement addressStateInput;

    @FindBy (xpath = "//input[@id='city']")
    public WebElement addressCityInput;

    @FindBy (xpath = "//input[@id='zipcode']")
    public WebElement addressZipCodeInput;

    @FindBy (xpath = "//input[@id='mobile_number']")
    public WebElement addressMobileNumberInput;

    @FindBy (xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

}
