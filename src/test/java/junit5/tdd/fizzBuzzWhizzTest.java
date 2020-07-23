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
}
