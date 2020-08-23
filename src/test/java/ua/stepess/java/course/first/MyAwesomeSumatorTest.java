package ua.stepess.java.course.first;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;
import org.junit.Test;

public class MyAwesomeSumatorTest {

    private final MyAwesomeSumator sumator = new MyAwesomeSumator();

    @Test
    public void shouldSum1() {
        int[] nums = {1, 3, 5, 6};

        int sum = sumator.sum(nums);

        assertEquals(15, sum);
    }

    @Test
    public void shouldSum2() {
        int[] nums = {1, 13, 4, 24};

        int sum = sumator.sum(nums);

        assertEquals(42, sum);
    }

    @Test
    public void shouldSum3() {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        int sum = sumator.sum(nums);

        assertEquals(0, sum);
    }

    @Test
    public void shouldSum4() {
        int[] nums = {0, 0, 0, 2, 0, 0, 11, 0, 0};

        int sum = sumator.sum(nums);

        assertEquals(13, sum);
    }

}