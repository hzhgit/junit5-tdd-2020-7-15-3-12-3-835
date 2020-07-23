package junit5.tdd;

import javafx.animation.Animation;
import org.junit.jupiter.api.Test;

import java.applet.AudioClip;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fizzBuzzWhizzTest {
    @Test
    void should_return1_when_paly_fizz_buzz_whizz_given_1() {
        //given
        int number = 1;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.playFizzBuzzWhizz(number);
        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_paly_fizz_buzz_whizz_given_3() {
        //given
        int number = 3;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.playFizzBuzzWhizz(number);
        //then
        assertEquals("fizz", actual);
    }

    @Test
    void should_return_buzz_when_paly_fizz_buzz_whizz_given_5() {
        //given
        int number = 5;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.playFizzBuzzWhizz(number);
        //then
        assertEquals("buzz", actual);
    }

    @Test
    void should_return_whizz_when_paly_fizz_buzz_whizz_given_7() {
        //given
        int number = 7;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.playFizzBuzzWhizz(number);
        //then
        assertEquals("whizz", actual);
    }

    @Test
    void should_return_fizzbuzz_when_paly_fizz_buzz_whizz_given_15() {
        //given
        int number = 15;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.playFizzBuzzWhizz(number);
        //then
        assertEquals("fizzbuzz", actual);
    }

    @Test
    void should_return_fizzbuzzwhizz_when_paly_fizz_buzz_whizz_given_105() {
        //given
        int number = 105;
        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.playFizzBuzzWhizz(number);
        //then
        assertEquals("fizzbuzzwhizz", actual);
    }
}
