package com.kiranpariyar.junit5demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
class FizzBuzzTest {

    @DisplayName("Play Fizz Buzz for Number = 0")
    @Test
    void testZero(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> new FizzBuzz().play(0));
    }

    @DisplayName("Play Fizz Buzz for Number = 1")
    @Test
    void testNumber(){
        String fizzBuzz = new FizzBuzz().play(1);
        Assertions.assertEquals("1",fizzBuzz);
    }

    @DisplayName("Play Fizz Buzz for Number = 3")
    @Test
    void testFizz(){
        String fizzBuzz = new FizzBuzz().play(3);
        Assertions.assertEquals("Fizz",fizzBuzz);
    }

    @DisplayName("Play Fizz Buzz for Number = 5")
    @Test
    void testBuzz(){
        String fizzBuzz = new FizzBuzz().play(5);
        Assertions.assertEquals("Buzz",fizzBuzz);
    }

    @DisplayName("Play Fizz Buzz for Number =15")
    @Test
    void testFizzBuzz(){
        String fizzBuzz = new FizzBuzz().play(15);
        Assertions.assertEquals("FizzBuzz",fizzBuzz);
    }

    @DisplayName("Test Fizz Buzz for List of numbers")
    @ParameterizedTest(name = "@ValueSource: PlayFizzBuzz(): Test# {index}: number = {0}")
    @ValueSource(ints = { 1, 2, 4, 7 ,8})
    void playFizzBuzz(int number){
        String fizzBuzz = new FizzBuzz().play(number);
        Assertions.assertEquals(String.valueOf(number),fizzBuzz);
    }
}