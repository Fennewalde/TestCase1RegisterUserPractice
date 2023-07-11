package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser_StepDefinitions {

    AutomationExerciseHomePage automationExerciseHomePage = new AutomationExerciseHomePage();
    AutomationExerciseLoginPage automationExerciseLoginPage = new AutomationExerciseLoginPage();
    AutomationExerciseSignUpPage automationExerciseSignUpPage = new AutomationExerciseSignUpPage();
    AutomationExerciseAccountCreatedPage automationExerciseAccountCreatedPage = new AutomationExerciseAccountCreatedPage();

    AutomationExerciseAccountDeletedPage automationExerciseAccountDeletedPage = new AutomationExerciseAccountDeletedPage();

    Faker faker = new Faker();;

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("https://www.automationexercise.com/");
    }
    @Given("User can see homepage successfully")
    public void user_can_see_homepage_successfully() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise");
    }
    @Then("User clicks on the Signuplogin button")
    public void user_clicks_on_the_signuplogin_button() {
        automationExerciseHomePage.SignupLoginButton.click();
    }
    @Then("User can see the New User Signup message")
    public void user_can_see_the_new_user_signup_message() {
        Assert.assertTrue(automationExerciseLoginPage.newUserSignUp_Text.isDisplayed());
    }
    @When("User enters {string} in the textfield and {string} in the email textfield")
    public void user_enters_in_the_textfield_and_in_the_email_textfield(String name, String email) {
        name = faker.harryPotter().character();
        email = faker.internet().emailAddress();
        automationExerciseLoginPage.newUserNameSignUp.sendKeys(name);
        automationExerciseLoginPage.newUserEmailSignUp.sendKeys(email);

    }
    @When("User clicks Signup Button")
    public void user_clicks_signup_button() {
        automationExerciseLoginPage.newUserSignUpButton.click();
    }
    @Then("User can see ENTER ACCOUNT INFORMATION")
    public void user_can_see_enter_account_information() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise - Signup");
    }
    @When("User selects their title by clicking radio button")
    public void user_selects_their_title_by_clicking_radio_button() {
       if(Math.random() < 0.5){
            automationExerciseSignUpPage.genderTitleRadioButtonFemale.click();
       }else{
           automationExerciseSignUpPage.genderTitleRadioButtonMale.click();
       }

    }

    @When("User enters {string} in the password textfield")
    public void user_enters_in_the_password_textfield(String password) {
        password = faker.internet().password();
       automationExerciseSignUpPage.passwordInput.sendKeys(password);
    }

    @When("User enters a {string} {string} {string} by using dropdown menus")
    public void user_enters_a_by_using_dropdown_menus(String month, String day, String year) {
        day = faker.number().numberBetween(1,30)+"";
        year = faker.number().numberBetween(1985,2021) + "";
        month = faker.number().numberBetween(1,12)+"";
           if(month == "1"){
               month = "January";
           }else if(month == "2"){
               month = "February";
           }else if(month == "3"){
               month = "March";
           }else if(month == "4"){
               month = "April";
           }else if(month == "5"){
               month = "May";
           }else if(month == "6"){
               month = "June";
           }else if(month == "7"){
               month = "July";
           }else if(month == "8"){
               month = "August";
           }else if(month == "9"){
               month = "September";
           }else if(month == "10"){
               month = "October";
           }else if(month == "11"){
               month = "November";
           }else {
               month = "December";
           }
        Select dayDropdown = new Select(automationExerciseSignUpPage.dateOfBirthDayDropDown);
        dayDropdown.selectByVisibleText(day);
        Select monthDropdown = new Select(automationExerciseSignUpPage.dateOfBirthMonthDropDown);
        monthDropdown.selectByVisibleText(month);
        Select yearDropdown = new Select(automationExerciseSignUpPage.dateOfBirthYearDropDown);
        yearDropdown.selectByVisibleText(year);

        BrowserUtils.sleep(5);
    }

    @When("User selects checkbox for the newsletter signup and special offers")
    public void user_selects_checkbox_for_the_newsletter_signup_and_special_offers() {
        automationExerciseSignUpPage.receiveSpecialOffersButton.click();
        automationExerciseSignUpPage.signUpForNewsletterButton.click();
    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String firstName, String lastName) {
        firstName = faker.gameOfThrones().dragon();
        lastName = faker.gameOfThrones().house();
        automationExerciseSignUpPage.addressInputFirstName.sendKeys(firstName);
        automationExerciseSignUpPage.addressInputLastName.sendKeys(lastName);
    }
    @When("User enters company {string}")
    public void user_enters_company(String string) {
        string = faker.company().name();
        automationExerciseSignUpPage.addressInputCompanyName.sendKeys(string);
    }
    @When("User enters {string} in address line")
    public void user_enters_in_address_line(String address1) {
        address1 = faker.address().streetAddress();
        automationExerciseSignUpPage.addressInputAddressLine1.sendKeys(address1);
    }
    @When("User enters {string} in second address line")
    public void user_enters_in_second_address_line(String string) {
        string = faker.address().secondaryAddress();
        automationExerciseSignUpPage.addressInputAddressLine2.sendKeys(string);
    }
    @When("User selects {string} from dropdown list")
    public void user_selects_from_dropdown_list(String string) {
        Select countryDropDown = new Select(automationExerciseSignUpPage.addressCountryDropDown);
        if(Math.random() < 0.2){
            string = "India";
        }else if(Math.random() < 0.4){
            string = "United States";
        }else if(Math.random() < 0.6){
            string = "Canada";
        }else if(Math.random() < 0.8){
            string = "Australia";
        }else{
            string = "Israel";
        }
        countryDropDown.selectByVisibleText(string);
    }
    @When("User enters {string}, {string}, and {string}")
    public void user_enters_and(String state, String city, String zipcode) {
        state = faker.address().state();
        city = faker.address().city();
        zipcode = faker.address().zipCode();
        automationExerciseSignUpPage.addressStateInput.sendKeys(state);
        automationExerciseSignUpPage.addressCityInput.sendKeys(city);
        automationExerciseSignUpPage.addressZipCodeInput.sendKeys(zipcode);

    }
    @When("User enters {string}")
    public void user_enters(String phoneNumber) {
        phoneNumber = faker.phoneNumber().phoneNumber();
        automationExerciseSignUpPage.addressMobileNumberInput.sendKeys(phoneNumber);
    }
    @When("User clicks the Create Account Button")
    public void user_clicks_the_create_account_button() {
        automationExerciseSignUpPage.createAccountButton.click();
    }
    @Then("User can see Account Created message")
    public void user_can_see_account_created_message() {
        Assert.assertTrue(automationExerciseAccountCreatedPage.accountCreatedTextVerification.isDisplayed());
    }
    @When("User clicks continue button")
    public void user_clicks_continue_button() {
        automationExerciseAccountCreatedPage.accountCreatedContinueButton.click();
    }
    @Then("User can see the Logged in as username message")
    public void user_can_see_the_logged_in_as_username_message() {
        Actions action = new Actions(Driver.getDriver());

        Driver.getDriver().switchTo().frame(automationExerciseAccountCreatedPage.iframe);
        action.click().perform();
        Driver.getDriver().switchTo().defaultContent();
        Assert.assertTrue(automationExerciseHomePage.loggedInAsText.isDisplayed());
    }
    @When("User clicks the Delete Account Button")
    public void user_clicks_the_delete_account_button() {
        automationExerciseHomePage.deleteAccountButton.click();
    }
    @Then("User can see the Account Deleted message")
    public void user_can_see_the_account_deleted_message() {
        Assert.assertTrue(automationExerciseAccountDeletedPage.accountDeletedVerificationText.isDisplayed());
    }
    @Then("User clicks the Continue button")
    public void user_clicks_the_continue_button() {
        automationExerciseAccountDeletedPage.continueButton.click();
    }


}
