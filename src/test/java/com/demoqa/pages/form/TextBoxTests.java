package com.demoqa.pages.form;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        Configuration.pageLoadStrategy = "eager";
        open("/text-box");
        $("#userName").setValue("Alex Egorov");
        $("#userEmail").setValue("alex@egorov.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();
        $(" #name").shouldHave(text("Alex Egorov"));
        $(" #email").shouldHave(text("alex@egorov.com"));
        $(" #currentAddress").shouldHave(text("Some address 1"));
        $(" #permanentAddress").shouldHave(text("Another address 1"));
    }
}
