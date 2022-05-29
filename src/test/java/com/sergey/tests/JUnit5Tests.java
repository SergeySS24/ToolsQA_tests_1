package com.sergey.tests;

import org.junit.jupiter.api.*;

public class JUnit5Tests {

    @BeforeAll
    static void initDB() {
        System.out.println("Initializing BD");
    }


    @BeforeEach
    void OpenYaPage() {
        System.out.println("/// ... ");
      //  Selenide.open("https://yandex.ru");
    }

    @AfterEach
    void close() {
        System.out.println("/// ... ");
     //   WebDriverRunner.closeWindow();
    }


    @AfterAll
    static void cleanDB() {
        System.out.println("Cleaning BD");
    }

    @Test
    void assertTest() {
        System.out.println("/// ...test1 ");
        //...поиск в новостях
    }

    @Test
    void assertTest2() {
        System.out.println("/// ... test2");
        //...поиск в картинках
    }


    @Test
    void assertTest3() {
        System.out.println("/// ... test3");
        Assertions.assertTrue(4 > 3);
    }

}

