package com.example.b;

/**
 * Simple greeter used to demonstrate JaCoCo coverage in module-b.
 */
public class Greeter {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, stranger!";
        }
        return "Hello, " + name + "!";
    }

    public String shout(String message) {
        return message.toUpperCase();
    }
}
