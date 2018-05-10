package org.igorski.junit5.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5TestsMixedBefores {
    /**
     * This @Before is NOT going to be executed.
     */
    @Before
    public void before() {
        System.out.println("@Before");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void simpleJunit5Test() {
        System.out.println("    Simple Junit 5 test.");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }

    /**
     * This @After is NOT going to be executed.
     */
    @After
    public void after() {
        System.out.println("@After");
    }
}
