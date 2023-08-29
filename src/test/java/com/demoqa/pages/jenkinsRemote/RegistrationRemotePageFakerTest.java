package com.demoqa.pages.jenkinsRemote;

import com.demoqa.pages.form.RemoteTestBase;
import com.demoqa.pages.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.pages.utils.TestDataParam.*;
import static io.qameta.allure.Allure.step;

@Tag("remote")
public class RegistrationRemotePageFakerTest extends RemoteTestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @DisplayName("Successful registration")
    void fillFormTest() {
        step("Open form", () -> {
            registrationPage
                    .openPage()
                    .settingsRegistrationPage();
        });
        step("Fill form", () -> {
            registrationPage
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setUserEmail(email)
                    .setGender(gender)
                    .setUserNumber(phoneNumber)
                    .setBirthDate(day, month, year)
                    .setUserHobbies(hobby)
                    .setUploadPicture(fileName)
                    .setCurrentAddress(address)
                    .setSubjectsInput(subject)
                    .choiceState(state)
                    .choiceCity(city)
                    .clickSubmit()
                    .thxForm("Thanks for submitting the form");
        });
        step("Verify results", () -> {
            registrationPage
                    .checkResult(firstName + " " + lastName)
                    .checkResult(email)
                    .checkResult(gender)
                    .checkResult(phoneNumber)
                    .checkResult(day + " " + month + "," + year)
                    .checkResult(subject)
                    .checkResult(fileName)
                    .checkResult(address)
                    .checkResult(state + " " + city)
                    .closeModal();
        });
    }
}