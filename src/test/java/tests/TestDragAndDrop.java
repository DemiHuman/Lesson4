package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestDragAndDrop extends TestBase {

    @Test
    public void doDragAndDrop() {
        //Открыть https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //Перенести прямоугольник А на место В
        $("#column-a").dragAndDropTo($("#column-b"));
        //Проверить, что прямоугольники поменялись
        $("#column-a").shouldHave(text("b"));
        $("#column-b").shouldHave(text("a"));
    }
}
