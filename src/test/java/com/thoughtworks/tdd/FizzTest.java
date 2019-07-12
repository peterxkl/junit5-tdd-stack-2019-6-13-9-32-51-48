package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class FizzTest {

    @Test
    public void should_return_1_by_1(){
         int number = 1;
         FizzBuzz fizzBuzz =new FizzBuzz();
         assertThat("1").isEqualTo(fizzBuzz.say());
    }
    @Test
    public void should_return_2_by_2(){
        int number = 2;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("2").isEqualTo(fizzBuzz.say());
    }
}
