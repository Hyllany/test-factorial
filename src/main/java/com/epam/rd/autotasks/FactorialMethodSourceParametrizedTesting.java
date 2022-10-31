package com.epam.rd.autotasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialMethodSourceParametrizedTesting {

    Factorial factorial = new Factorial();

    static Stream<Arguments> testCases(){
        return Stream.of(Arguments.of("2", "2"),
                Arguments.of("7", "5040"),
                Arguments.of("3", "6"));
    }
    @ParameterizedTest
    @MethodSource("testCases")
    void testFactorial(String in, String expected) {
    assertEquals(expected, factorial.factorial(in));
    }

}
