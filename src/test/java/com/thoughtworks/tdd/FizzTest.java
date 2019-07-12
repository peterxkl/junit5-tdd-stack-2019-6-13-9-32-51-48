package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class FizzTest {

    @Test
    public void should_return_1_by_1(){
         int number = 1;
         FizzBuzz fizzBuzz =new FizzBuzz();
         assertThat("1").isEqualTo(fizzBuzz.say(1));
    }
    @Test
    public void should_return_2_by_2(){
        int number = 2;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("2").isEqualTo(fizzBuzz.say(2));
    }
    @Test
    public void should_return_Fizz_by_3(){
        int number = 3;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("Fizz").isEqualTo(fizzBuzz.say(3));
    }
    @Test
    public void should_return_Buzz_by_5(){
        int number = 5;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("Buzz").isEqualTo(fizzBuzz.say(5));
    }
    @Test
    public void should_return_Fizz_by_6(){
        int number = 6;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("Fizz").isEqualTo(fizzBuzz.say(6));
    }
    @Test
    public void should_return_Whizz_by_7(){
        int number = 7;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("Whizz").isEqualTo(fizzBuzz.say(7));
    }
    @Test
    public void should_return_Buzz_by_10(){
        int number = 10;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("Buzz").isEqualTo(fizzBuzz.say(10));
    }
    @Test
    public void should_return_Whizz_by_14(){
        int number = 14;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("Whizz").isEqualTo(fizzBuzz.say(14));
    }
    @Test
    public void should_return_Whizz_by_15(){
        int number = 15;
        FizzBuzz fizzBuzz =new FizzBuzz();
        assertThat("FizzBuzz").isEqualTo(fizzBuzz.say(15));
    }
}
