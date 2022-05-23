package com.sergey;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @BeforeEach
    void OpenYaPage() {
        Selenide.open("https://yandex.ru");
    }

    @AfterEach
    void close() {
        WebDriverRunner.closeWindow();
    }


    @Test
    void assertTest() {
        //...поиск в новостях
    }

    @Test
    void assertTest2() {
        //...поиск в картинках
    }


    @Test
    void assertTest3() {
        Assertions.assertTrue(4 > 3);
    }

}

