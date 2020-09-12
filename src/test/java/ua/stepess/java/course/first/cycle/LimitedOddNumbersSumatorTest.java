package ua.stepess.java.course.first.cycle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LimitedOddNumbersSumatorTest {

    private final LimitedOddNumbersSumator sumator = new LimitedOddNumbersSumator();

    @Test
    public void shouldSum1() {
        int limit = 5;

        int sum = sumator.sum(limit);

        assertEquals(25, sum);
    }

    @Test
    public void shouldSum2() {
        int limit = 100;

        int sum = sumator.sum(limit);

        assertEquals(10000, sum);
    }

    @Test
    public void shouldSum3() {
        int limit = 6;

        int sum = sumator.sum(limit);

        assertEquals(36, sum);
    }

    @Test
    public void shouldSum4() {
        int limit = 7;

        int sum = sumator.sum(limit);

        assertEquals(49, sum);
    }

}