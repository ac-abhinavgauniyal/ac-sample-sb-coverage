package com.example.b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreeterUnitTest {

    private final Greeter greeter = new Greeter();

    @Test
    void greetsNamedPerson() {
        assertEquals("Hello, Ada!", greeter.greet("Ada"));
    }

    @Test
    void greetsStrangerWhenBlank() {
        assertEquals("Hello, stranger!", greeter.greet(""));
        assertEquals("Hello, stranger!", greeter.greet(null));
    }

    @Test
    void shoutsMessage() {
        assertEquals("HELLO", greeter.shout("hello"));
    }
}
