package ua.stepess.java.course.first.cycle;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;

public class FastestSorterTest {

    private final FastestSorter sorter = new FastestSorter();

    @Test
    public void shouldSort1() {
        int[] array = new int[]{2, 3, 1, 5, 4, 0};

        int[] result = sorter.sort(Arrays.copyOf(array, array.length));

        Arrays.sort(array);
        assertArrayEquals(array, result);
    }

    @Test
    public void shouldSort2() {
        int[] array = new int[]{2, 2, 1, 1, 1, 0};

        int[] result = sorter.sort(Arrays.copyOf(array, array.length));

        Arrays.sort(array);
        assertArrayEquals(array, result);
    }

    @Test
    public void shouldSort3() {
        int[] array = new int[]{0};

        int[] result = sorter.sort(Arrays.copyOf(array, array.length));

        Arrays.sort(array);
        assertArrayEquals(array, result);
    }

    @Test
    public void shouldSort4() {
        int[] array = new int[]{};

        int[] result = sorter.sort(Arrays.copyOf(array, array.length));

        Arrays.sort(array);
        assertArrayEquals(array, result);
    }

    @Test
    public void shouldSort5() {
        int[] array = new int[]{-1, 2, -66, 13, 42, 0, 3};

        int[] result = sorter.sort(Arrays.copyOf(array, array.length));

        Arrays.sort(array);
        assertArrayEquals(array, result);
    }

}