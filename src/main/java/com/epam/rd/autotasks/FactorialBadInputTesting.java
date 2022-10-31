package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
    Assertions.assertThrows(IllegalArgumentException.class, ()-> factorial.factorial(null));
    }

    @Test
    void testNegativeInput(){
    Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorial("-2"));
    }

    @Test
    void testFractionalInput(){
    Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorial("6.4"));
    }

    @Test
    void testNonDigitalInput(){
    Assertions.assertThrows(IllegalArgumentException.class, ()-> factorial.factorial("ups"));
    Assertions.assertThrows(IllegalArgumentException.class, ()-> factorial.factorial(" "));

    }


}
