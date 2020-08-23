package ua.stepess.java.course.first;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfDaysResolverTest {

    private final NumberOfDaysResolver resolver = new NumberOfDaysResolver();

    @Test
    public void shouldResolve1() {
        int month = 8;
        int year = 2020;

        int numberOfDays = resolver.resolve(month, year);

        assertEquals(31, numberOfDays);
    }

    @Test
    public void shouldResolve2() {
        int month = 12;
        int year = 2020;

        int numberOfDays = resolver.resolve(month, year);

        assertEquals(31, numberOfDays);
    }

    @Test
    public void shouldResolve3() {
        int month = 2;
        int year = 2016;

        int numberOfDays = resolver.resolve(month, year);

        assertEquals(29, numberOfDays);
    }

    @Test
    public void shouldResolve4() {
        int month = 2;
        int year = 2017;

        int numberOfDays = resolver.resolve(month, year);

        assertEquals(28, numberOfDays);
    }

}