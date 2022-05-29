package com.sergey.docs;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CssXpathExamples {
    void cssXpathExamples() {
         //<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("123"); //способ 1
        $(by("data-testid", "email")).setValue("123"); // способ 2

    }
}
