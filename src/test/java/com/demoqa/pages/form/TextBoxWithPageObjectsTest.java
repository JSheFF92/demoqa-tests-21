package com.demoqa.pages.form;

import com.demoqa.pages.TextBoxRegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxWithPageObjectsTest extends TestBase {

    TextBoxRegistrationPage TextBox = new TextBoxRegistrationPage();

    @Test
    void fillFormTest() {
        TextBox
                .openPage()
                .setFulltName("Evgenyi Sheff")
                .setEmailInput("Sheff@evgenyi.com")
                .setCurrentAddress("Sheff guru 7")
                .setPermanentAddress("Evgenyi guru 20k2")
                .clickSubmit()

                .checkName("Evgenyi Sheff")
                .checkEmail("Sheff@evgenyi.com")
                .checkCurrentAddress("Sheff guru 7")
                .checkPermanentAddress("Evgenyi guru 20k2");
    }
}
