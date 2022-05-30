package com.sergey.docs;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
         //<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("123"); //способ 1
        $(by("data-testid", "email")).setValue("123"); // способ 2


        //<input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("123");
        $("#email").setValue("123"); //на курсе используют этот способ
        $(byId("#email")).setValue("123");
        $x("//*[@id='email']").setValue("123");
        $(byXpath("//*[@id='email']")).setValue("123");


    }
}
