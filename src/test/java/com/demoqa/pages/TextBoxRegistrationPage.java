package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxRegistrationPage {
    SelenideElement
            fullNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            addFormSubmit = $("#submit"),

    outputName = $("#output #name"),
            outputEmail = $("#output #email"),
            outputCurrentAddress = $("#output #currentAddress"),
            outputPermanentAddress = $("#output #permanentAddress");


    public TextBoxRegistrationPage openPage() {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }


    public TextBoxRegistrationPage setFulltName(String value) {
        fullNameInput.setValue(value);

        return this;
    }

    public TextBoxRegistrationPage setEmailInput(String value) {
        userEmailInput.setValue(value);

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

    public TextBoxRegistrationPage checkPermanentAddress(String value) {
        outputPermanentAddress.shouldHave(text(value));

        return this;
    }

}