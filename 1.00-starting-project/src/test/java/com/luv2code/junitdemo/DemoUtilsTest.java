package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    @Test
    void getAcademyInList() {
    }

    @Test
    void getAcademy() {
    }

    @Test
    void getAcademyDuplicate() {
    }

    @Test
    void getFirstThreeLettersOfAlphabet() {
    }

    @Test
    void add() {
        DemoUtils demoUtils = new DemoUtils();
        int a = 6,b = 8;
        assertEquals(14,demoUtils.add(a, b),"6 + 8 must be 14");
        assertNotEquals(15,demoUtils.add(a, b),"6 + 8 must not be 14");
    }

    @Test
    void multiply() {
    }

    @Test
    void checkNull() {
        DemoUtils demoUtils = new DemoUtils();
        Object obj1 = null,obj2 = 13;
        assertNull(demoUtils.checkNull(null),"obj1 must be null");
        assertNotNull(demoUtils.checkNull(obj2),"obj2 must not be null");
    }

    @Test
    void isGreater() {
    }

    @Test
    void throwException() {
    }

    @Test
    void checkTimeout() {
    }
}