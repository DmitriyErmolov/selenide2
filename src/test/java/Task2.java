import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Task2 {

    @Test
    void testDragAndDrop(){
        // Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Проверить, что первый прямоугольник содержит тест "А"
        $("#column-a header").shouldHave(text("A"));
        // Перенесите прямоугольник А на место В
        $("#column-a").dragAndDropTo("#column-b");
        // Проверить, что первый прямоугольник содержит тест "B"
        $("#column-a header").shouldHave(text("B"));
    }
}
