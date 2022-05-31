package com.sergey.docs;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
         //<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("123"); //способ 1
        $(by("data-testid", "email")).setValue("123"); // способ 2


        //<input type="email" class="inputtext login_form_input_box" name="email" id="email"> //если нет атрибута testid
        $("[id=email]").setValue("123");
        $("#email").setValue("123"); //на курсе используют этот способ
        $(byId("#email")).setValue("123");
        $x("//*[@id='email']").setValue("123");
        $(byXpath("//*[@id='email']")).setValue("123");

        //<input type="email" class="inputtext login_form_input_box" name="email"> // если нет атрибута id
        $("[name=email]").setValue("123"); //вариант 1
        $(byName("email")).setValue("123"); //вариант 2

        //<input type="email" class="inputtext login_form_input_box"> // если нет атрибута name
        $("[class=login_form_input_box]").setValue("123"); // вариант 1
        $(".inputtext.login_form_input_box").setValue("123"); // вариант 2
        $("input.inputtext.login_form_input_box").setValue("123"); // вариант 3
        $(byXpath("//input[@class='login_form_input_box']")).setValue("123");
        $(byXpath("//input[@class='inputtext'][@class='login_form_input_box']")).setValue("123");

         //<div> class="inputtext"
        //      <input type="email" class="login_form_input_box" name="email" id="email">
        //</div>
        $(".inputtext.login_form_input_box").setValue("123");


        //<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $(".inputtext.login_form_input_box#email[name=email][data-testid=email]").setValue("123"); // используемый
        // на курсе способ со всеми вставленными атрибутами

        //  <div>Hello qa.guru</div>  // поиск по тексту
        $x("//div[text()='Hello qa.guru']");
        $x("//div[contains(text(), 'ello qa.gur']");
        $x("//div[text()[contains(., 'ello qa.gur')]]");

        $(byText("Hello qa.guru")); //нормальный вариант
        $(withText("ello qa.gur")); //нормальный вариант
    }
}
