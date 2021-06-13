package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SearchingTheExampleOfJUnit5InRepository extends TestBase {

    @Test
    void searchingTheExampleOfCode() {
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        //Перейти в раздел Wiki проекта
        $("[data-content=Wiki]").click();
        $("h1", 2).shouldHave(
                text("Welcome to the selenide wiki!"));

        //Проверяем, что в списке страниц (Pages) есть страница SoftAssertions
        $(withText("Show 1 more pages")).click();
        $(".wiki-rightbar").shouldHave(
                text("SoftAssertions"));

        //Открыть страницу SoftAssertions
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $("h1", 1).shouldHave(
                text("SoftAssertions"));

        //Проверить что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(
                text("Using JUnit5 extend test class"));
    }
}
