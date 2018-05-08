package org.igorski;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class DummyTestOne {
    private static final Random random = new Random();

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This will run BEFORE ALL tests.");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("This will run BEFORE each test.");
    }

    @Test
    public void dummyTestMethodOne() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
    }

    @Test
    public void dummyTestMethodTwo() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
    }

    @Disabled
    public void disabledTest() {
        System.out.println("This test is disabled.");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("This will run AFTER each test.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This will run AFTER ALL tests.");
    }
}
