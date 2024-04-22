package com.ilcarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LetTheCarWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class LetTheCarWorkSteps{

    @And("User clicks on the Let the car work link")
    public void clicks_on_the_Let_the_car_work_link(){
        new HomePage(driver).clickOnTheCarWorkLink();
    }

    @And("User fills Location details")
    public void fills_Location_details(){
        new LetTheCarWorkPage(driver).fillLocation("Tel Aviv, Israel");
    }

    @And("User fills Manufacturer")
    public void fills_Manufacturer(){
        new LetTheCarWorkPage(driver).fillManufacturer("12345678");
    }

    @And("User fills Model details")
    public void fills_Model_details(){
        new LetTheCarWorkPage(driver).fillModelDetals("Ford-Focus");
    }

    @And("User fills Year")
    public void fills_Year(){
        new LetTheCarWorkPage(driver).fillTheYear("2005");
    }

    @And("User selects Fuel")
    public void selects_Fuel(){
        new LetTheCarWorkPage(driver).selectFuel("Diesel");
    }

    @And("User fills Seats")
    public void fills_Seats(){
        new LetTheCarWorkPage(driver).fillSeats("4");
    }

    @And("User fills Car class")
    public void fills_Car_class(){
        new LetTheCarWorkPage(driver).fillCarClass("A");
    }

    @And("User fills Car registration number")
    public void fills_Car_registration_number(){
        new LetTheCarWorkPage(driver).fillCarRegistrationNumber("123456789");
    }

    @And("User fills Price")
    public void fills_Price(){
        new LetTheCarWorkPage(driver).fillPrice("500");
    }

    @And("User fills About that car")
    public void fills_About_that_car(){
        new LetTheCarWorkPage(driver).fillAboutCar("Nice and New Car");
    }

    @And("User uploads photos of the car")
    public void uploads_photos_of_the_car(){
        new LetTheCarWorkPage(driver).uploadPhotosOfTheCar("C:/Tools/Screenshot.png");
    }

    @And("User clicks on the Submit button")
    public void clicks_on_the_Submit_button(){
        new LetTheCarWorkPage(driver).clickSubmitButton();
    }

    @Then("Car adding failed Message is displayed")
    public void car_adding_failed_Message_is_displayed(){
        new LetTheCarWorkPage(driver).isMessageDisplayed("JWT strings must contain exactly 2 period characters. Found: 0");
    }

    // Then User closes the browser step is not needed because it's usually handled by the test framework
}
