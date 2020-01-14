package com.xs.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

    @ParameterizedTest(name = "expected {1} when input is {0}")
    @CsvSource({
            "1,'1'",
            "3,'Fizz'",
            "5,'Buzz'",
            "15,'FizzBuzz'",
    })
    void test_of(int in, String out) {
        assertThat(FizzBuzz.of(in)).isEqualTo(out);
    }
}
