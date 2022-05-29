package com.sergey;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        String name = "Alex Jones"; //использует name в качестве alias и подтягивает соответственное значение в код

        open("/text-box");

        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue("alex@jones.com");
        $("[id=currentAddress]").setValue("Some street 1");
        $("[id=permanentAddress]").setValue("Another street 2");
        $("[id=submit]").click();

        //Asserts
        $("[id=output]").shouldHave(text(name), text("alex@jones.com"),
                         text("Some street 1"), text("Another street 2"));

  //      $("[id=output] [id=name]").shouldHave(text(name)); //вариант №1 (в поле вывода имя соответствует
  //      // полю имени)
  //      $("[id=output]").$("[id=name]").shouldHave(text(name)); // вариант 2
  //      $("[id=name]").shouldHave(text(name));

  //      $("[id=permanentAddress]").shouldHave(text("permanentAddress :Another street 2")); //wrong
  //      $("p[id=permanentAddress]").shouldHave(text("permanentAddress :Another street 2")); //p - название элемента
  //      $("[id=permanentAddress]", 1).shouldHave(text("permanentAddress :Another street 2")); //нужно стараться по индексам не обращаться

        //Старый подход. 3 нижние строчки идентичны строчке 43
  //      String expectedPermanentAddress = "Another street 2";
  //      String actualPermanentAddress = $("p[id=permanentAddress]").text();
  //      assertEquals(expectedPermanentAddress, actualPermanentAddress);

    }
}
