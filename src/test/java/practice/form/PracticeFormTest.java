package practice.form;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Optional;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeAll
    static void beforeAll() {
        Optional<Path> browserPath =  WebDriverManager.chromedriver() .getBrowserPath();
        System.out.println("#### PATH: " +((Optional<?>) browserPath).get());
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void fillFormTest() {
        Configuration.pageLoadStrategy="eager";
        open("/automation-practice-form");
//        $("#firstName").setValue("Evgenyi");
//        $("#lastName").setValue("Shevchuk");
//        $("#userEmail").setValue("Evgenyi@Shevchuk.com");
//        $("#genterWrapper").$(byText("Other")).click();
//        $("#userNumber").setValue("8(666)7778889");
//        $("#dateOfBirthInput").click();
//        $(".react-datepicker__year-select").$(byText("1992")).click();
//        $(".react-datepicker__month-select").$(byText("September")).click();
//        $("div.react-datepicker__week div.react-datepicker__day--029").click();
        $("#state").click();
        $("#currentAddress").setValue("1");
//        $("#subjectsContainer").setValue("1");

//        $("#hobbiesWrapper").$(byText("Sports")).click();
        Configuration.timeout = 10;

//        $("#submit").click();

//        $("#output").$("#name").shouldHave(text("Alex Egorov"));
//        $("#output #firstName").shouldHave(text("Alex"));
//        $("#output #lastName").shouldHave(text("Egorov"));
//        $("#output #email").shouldHave(text("alex@egorov.com"));
//        $("#output #Number").shouldHave(text("8(666)7778889"));
    }
}