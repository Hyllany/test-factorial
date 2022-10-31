package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    public void testInputBigNumbers(){
        String input = "20";
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(input));
    }
}
