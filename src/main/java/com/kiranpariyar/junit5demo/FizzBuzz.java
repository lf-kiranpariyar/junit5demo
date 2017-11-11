package com.kiranpariyar.junit5demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
class FizzBuzz {

    String play(int number) {
        if(number == 0) throw new IllegalArgumentException("Number should not be zero.");
        if(number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if(number % 3 == 0) return "Fizz";
        if(number % 5 == 0) return "Buzz";
        return String.valueOf(number);
    }

    List<String> generateFizzBuzz(List<Integer> numbers){
        List<String> fizzBuzzList = new ArrayList<>();
        numbers.forEach(number ->
                fizzBuzzList.add(play(number))
        );
        return fizzBuzzList;
    }
}
