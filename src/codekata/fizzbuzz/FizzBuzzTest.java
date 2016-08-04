package codekata.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Klaudioz on 03-Aug-16.
 */
public class FizzBuzzTest {
    @Test
    public void testFizzBuzzOf0is0() {
        assertThat(FizzBuzz.of(0), is("0"));
    }
    @Test
    public void testFizzBuzzOf1is1() {
        assertThat(FizzBuzz.of(1), is("1"));
    }
    @Test
    public void testFizzBuzzOf3isFizz() {
        assertThat(FizzBuzz.of(3), is("Fizz"));
    }
    @Test
    public void testFizzBuzzOf5isBuzz() {
        assertThat(FizzBuzz.of(5), is("Buzz"));
    }
    @Test
    public void testFizzBuzzOf6isFizz() {
        assertThat(FizzBuzz.of(6), is("Fizz"));
    }
    @Test
    public void testFizzBuzzOf10isBuzz() {
        assertThat(FizzBuzz.of(10), is("Buzz"));
    }
    @Test
    public void testFizzBuzzOf15isFizzBuzz() {
        assertThat(FizzBuzz.of(15), is("FizzBuzz"));
    }
}
