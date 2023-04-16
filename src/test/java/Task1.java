import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Task1 {
    @Test
    void checkOpeningOfThePageEnterprise(){
        // Открыть страницу https://github.com/
        open("https://github.com/");
        // Навести курсор мыши на выпадающий список "Solutions"
        $(byText("Solutions")).hover();
        // Выбрать "Enterprise"
        $(byText("Enterprise")).click();
        // Убедитесь что загрузилась нужная страница (заголовок "Build like the best.")
        $(".enterprise-hero").shouldHave(text("Build like the best"));
    }
}
