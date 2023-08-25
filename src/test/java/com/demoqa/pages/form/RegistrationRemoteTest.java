package com.demoqa.pages.form;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("remote")
public class RegistrationRemoteTest extends RemoteTestBase {

    @Test
    @DisplayName("Successful registration")
    void fillFormTest() {
        step("Open form", () -> {
            open("/automation-practice-form");
            $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
            executeJavaScript("$('#fixedban').remove()");
            executeJavaScript("$('footer').remove()");
        });
        step("Fill form", () -> {
            $("#firstName").setValue("Evgenyi");
            $("#lastName").setValue("Shevchuk");
            $("#userEmail").setValue("Evgenyi@Shevchuk.com");
            $("#genterWrapper").$(byText("Female")).click();
            $("#userNumber").setValue("8905784381");

            $("#dateOfBirthInput").click();
            $(".react-datepicker__year-select").$(byText("1992")).click();
            $(".react-datepicker__month-select").$(byText("September")).click();
            $("div.react-datepicker__week div.react-datepicker__day--029").click();

            $("#hobbiesWrapper").$(byText("Sports")).click();
            $("#uploadPicture").uploadFromClasspath("images.jpeg");
            $("#currentAddress").setValue("Protvino");
            $("input#subjectsInput").setValue("Maths").pressEnter();

            $("#state").click();
            $("#stateCity-wrapper div#react-select-3-option-0").click();
            $("#city").click();
            $("#city div#react-select-4-option-1").click();
            $("#submit").click();
        });
        step("Verify results", () -> {
            $(".table-responsive").shouldHave(text("Evgenyi Shevchuk"));
            $(".table-responsive").shouldHave(text("Evgenyi@Shevchuk.com"));
            $(".table-responsive").shouldHave(text("Female"));
            $(".table-responsive").shouldHave(text("8905784381"));
            $(".table-responsive").shouldHave(text("29 September,1992"));
            $(".table-responsive").shouldHave(text("Maths"));
            $(".table-responsive").shouldHave(text("images.jpeg"));
            $(".table-responsive").shouldHave(text("Protvino"));
            $(".table-responsive").shouldHave(text("NCR Gurgaon"));
            $("#closeLargeModal").click();
        });
    }
}