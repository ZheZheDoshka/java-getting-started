package ua.stepess.java.course.first;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LimitedOddNumbersSumatorTest {

    private final LimitedOddNumbersSumator sumator = new LimitedOddNumbersSumator();

    @Test
    private void shouldSum1() {
        int limit = 5;

        int sum = sumator.sum(limit);

        assertEquals(25, sum);
    }

    @Test
    private void shouldSum2() {
        int limit = 100;

        int sum = sumator.sum(limit);

        assertEquals(10000, sum);
    }

    @Test
    private void shouldSum3() {
        int limit = 6;

        int sum = sumator.sum(limit);

        assertEquals(36, sum);
    }

    @Test
    private void shouldSum4() {
        int limit = 7;

        int sum = sumator.sum(limit);

        assertEquals(49, sum);
    }

}