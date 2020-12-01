import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleSearcherTest {
    @Test
    void searchInGoogle() {
        open("https://www.google.ru/");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("html").shouldHave(Condition.text("selenide.org"));
    }
}
