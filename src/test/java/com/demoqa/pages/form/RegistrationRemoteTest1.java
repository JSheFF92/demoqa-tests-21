package com.demoqa.pages.form;

import com.demoqa.pages.pages.RegistrationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.pages.utils.TestDataParam.*;

//@Tag("remote")
public class RegistrationRemoteTest1 extends RemoteTestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @DisplayName("Successful registration")
    void fillFormTest() {
        registrationPage
                .openPage()
                .settingsRegistrationPage()
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
    }
}