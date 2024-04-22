package com.ilCarro.pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LetTheCarWorkPage extends BasePage{
    public LetTheCarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement inputLocation;

    public LetTheCarWorkPage fillLocation(String location) {
        type(inputLocation,location);
        pause(500);
        inputLocation.sendKeys(Keys.ARROW_DOWN);
        inputLocation.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement inputManufacturer;
    public LetTheCarWorkPage fillManufacturer(String manufactur) {
        type(inputManufacturer,manufactur);
        return this;
    }

    @FindBy(id = "model")
    WebElement inputModel;
    public LetTheCarWorkPage fillModelDetals(String model) {
        type(inputModel,model);
        return this;
    }

    @FindBy(id = "year")
    WebElement inputYear;
    public LetTheCarWorkPage fillTheYear(String numberOfYear) {
        type(inputYear,numberOfYear);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement inputFuel;

    public LetTheCarWorkPage selectFuel(String fuel) {
        Select select = new Select(inputFuel);
        select.selectByVisibleText(fuel);
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
        }
        return this;
    }

    @FindBy(id = "seats")
    WebElement inputSeats;
    public LetTheCarWorkPage fillSeats(String numberOfSeats) {
        type(inputSeats,numberOfSeats);
        return this;

    }

    @FindBy(id = "class")
    WebElement inputCarClass;

    public LetTheCarWorkPage fillCarClass(String carclass) {
        type(inputCarClass,carclass);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement inputRegistrationNumber;
    public LetTheCarWorkPage fillCarRegistrationNumber(String registrationNumber) {
        type(inputRegistrationNumber,registrationNumber);
        return this;
    }

    @FindBy(id = "price")
    WebElement inputPrice;
    public LetTheCarWorkPage fillPrice(String price) {
        type(inputPrice,price);
        return this;
    }

    @FindBy(id = "about")
    WebElement inputAboutCar;

    public LetTheCarWorkPage fillAboutCar(String carInfo) {
        type(inputAboutCar,carInfo);
        return this;
    }

    @FindBy(id = "photos")
    WebElement uploadPhoto;

    public LetTheCarWorkPage uploadPhotosOfTheCar(String path) {
        uploadPhoto.sendKeys(path);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;
    public LetTheCarWorkPage clickSubmitButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        click(submitButton);
        return this;
    }

    @FindBy(css = ".message")
    WebElement message;
    public LetTheCarWorkPage isMessageDisplayed(String text) {
        assert message.getText().contains(text);
        return this;
    }
}
