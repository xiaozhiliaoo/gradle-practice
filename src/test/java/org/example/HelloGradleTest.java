package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloGradleTest {

    @Test
    void hello() {
        assertEquals(HelloGradle.hello(), "hello");
    }
}