package com.demoqa.pages.form;

import com.demoqa.pages.TextBoxRegistrationPage;
import org.junit.jupiter.api.Test;


public class TextBoxWithPageObjectsTest extends TestBase {

    TextBoxRegistrationPage TextBox = new TextBoxRegistrationPage();

    @Test
    void fillFormTest() {
        TextBox
                .openPage()
                .settingsBoxPage()
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
