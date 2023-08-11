package com.demoqa.pages.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxRegistrationPage {

    SelenideElement
            inputFullName = $("#userName"),
            inputUserEmail = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            addFormSubmit = $("#submit"),

            outputName = $("#output #name"),
            outputEmail = $("#output #email"),
            outputCurrentAddress = $("#output #currentAddress"),
            outputPermanentAddress = $("#output #permanentAddress");

    public TextBoxRegistrationPage openPage() {
        open("/text-box");

        return this;
    }

    public TextBoxRegistrationPage settingsBoxPage() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public TextBoxRegistrationPage setFullName(String value) {
        inputFullName.setValue(value);

        return this;
    }

    public TextBoxRegistrationPage setEmailInput(String value) {
        inputUserEmail.setValue(value);

        return this;
    }

    public TextBoxRegistrationPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxRegistrationPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public TextBoxRegistrationPage clickSubmit() {
        addFormSubmit.click();

        return this;
    }

    public TextBoxRegistrationPage checkName(String value) {
        outputName.shouldHave(text(value));

        return this;
    }

    public TextBoxRegistrationPage checkEmail(String value) {
        outputEmail.shouldHave(text(value));

        return this;
    }

    public TextBoxRegistrationPage checkCurrentAddress(String value) {
        outputCurrentAddress.shouldHave(text(value));

        return this;
    }

    public void checkPermanentAddress(String value) {
        outputPermanentAddress.shouldHave(text(value));
    }
}