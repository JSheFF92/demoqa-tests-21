package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    CalendarComponent calendar = new CalendarComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDateInput = $("#dateOfBirthInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            subjectsInput = $("input#subjectsInput"),
            clickState = $("#state"),
            choiceState = $("#stateCity-wrapper div#react-select-3-option-0"),
            clickCity = $("#city"),
            choiceCity = $("#city div#react-select-4-option-1"),
            addFormSubmit = $("#submit"),
            thanksText = $("#example-modal-sizes-title-lg"),
            tableResponsive = $(".table-responsive"),
            closeLargModal = $("#closeLargeModal");




    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        birthDateInput.click();
        calendar.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setUserHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public RegistrationPage setSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage choiceState() {
        clickState.click();
        choiceState.click();

        return this;
    }

    public RegistrationPage choiceCity() {
        clickCity.click();
        choiceCity.click();


        return this;
    }

    public RegistrationPage clickSubmit() {
        addFormSubmit.click();

        return this;
    }

    public RegistrationPage thxForm(String value) {
        thanksText.shouldHave(text(value));

        return this;
    }

    public RegistrationPage checkResult(String value) {
        tableResponsive.shouldHave(text(value));

        return this;
    }

    public RegistrationPage closeModal() {
        closeLargModal.click();

        return this;
    }
}