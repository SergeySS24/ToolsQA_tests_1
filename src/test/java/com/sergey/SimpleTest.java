package com.sergey;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void initDB() {
        System.out.println("Инициализация БД до тестов");
    }


    @BeforeEach
    void OpenYaPage() {
        Selenide.open("https://yandex.ru");
    }

    @AfterEach
    void close() {
        WebDriverRunner.closeWindow();
    }


    @BeforeAll
    static void cleanDB() {
        System.out.println("Очистка БД после тестов");
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

