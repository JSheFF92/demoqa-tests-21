package practice.form;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        Configuration.pageLoadStrategy="eager";
        open("/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Egorov");
        $("#userEmail").setValue("alex@egorov.com");
        $("#userNumber").setValue("8(666)7778889");
//        $(".custom-control-inline hobbies-checkbox-1").click();
        $x("//label[text()='Other']").click();
        $x("//label[text()='Sports']").click();

        $("#submit").click();

//        $("#output").$("#name").shouldHave(text("Alex Egorov"));
        $("#output #firstName").shouldHave(text("Alex"));
        $("#output #lastName").shouldHave(text("Egorov"));
        $("#output #email").shouldHave(text("alex@egorov.com"));
        $("#output #Number").shouldHave(text("8(666)7778889"));
    }
}
