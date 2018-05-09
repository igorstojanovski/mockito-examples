package org.igorski.junit5.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Junit4Tests {

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
    public void simpleTest() {
        System.out.println("    Simple Junit 4 test.");
    }

    @After
    public void after() {
        System.out.println("@After");
    }
}
