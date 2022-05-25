package com.sergey;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");

        $("[id=userName}").setValue("Alex Jones");
        $("[id=userEmail}").setValue("alex@jones");
        $("[id=currentAddress}").setValue("Some street 1");
        $("[id=permanentAddress}").setValue("Another street 2");
        $("[id=submit}").click();
    }
}
