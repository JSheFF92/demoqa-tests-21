package com.demoqa.pages.form;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationWithPageObjectsTest extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Evgenyi")
                .setLastName("Shevchuk")
                .setUserEmail("Evgenyi@Shevchuk.com")
                .setGender("Female")
                .setUserNumber("8905784381")
                .setBirthDate("29", "September", "1992")
                .setUserHobbies("Sports")
                .setUploadPicture("images.jpeg")
                .setCurrentAddress("Protvino")
                .setSubjectsInput("Maths")
                .choiceState()
                .choiceCity()
                .clickSubmit()


                .thxForm("Thanks for submitting the form");
        registrationPage
                .checkResult("Evgenyi")
                .checkResult("Shevchuk")
                .checkResult("Evgenyi@Shevchuk.com")
                .checkResult("Female")
                .checkResult("8905784381")
                .checkResult("29 September,1992")
                .checkResult("Maths")
                .checkResult("images.jpeg")
                .checkResult("Protvino")
                .checkResult("NCR Gurgaon")

                .closeModal();
    }
}