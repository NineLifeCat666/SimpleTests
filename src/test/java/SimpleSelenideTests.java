import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SimpleSelenideTests {
    @Test
    void searchInGoogleSelenideTest() {
        open("https://www.google.ru/");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("html").shouldHave(text("selenide.org"));
    }

    @Test
    void openSelenideTest() {
        open("https://selenide.org");
        $("body").shouldBe(text("What is Selenide?"));
    }
}
