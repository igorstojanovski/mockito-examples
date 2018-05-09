package org.igorski.junit5.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MixedTests {
    @Before
    public void before() {
        System.out.println("@Before");
    }

    /**
     * This method is not going to be executed.
     */
    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void simpleJunit5Test() {
        System.out.println("    Simple Junit 5 test.");
    }

    @org.junit.Test
    public void simpleJunit4Test() {
        System.out.println("    Simple Junit 4 test.");
    }

    @After
    public void after() {
        System.out.println("@After");
    }
}
