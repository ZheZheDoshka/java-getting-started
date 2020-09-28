package ua.stepess.java.course.first.switchex;

/**
 * Write a Java program to find the number of days in a month.
 */
public class NumberOfDaysResolver {

    public int resolve(int month, int year) //why switchex?
    {
        // TODO: write here
        if (month == 2)
        {
            if (year % 4 == 0) { return(29); }
            else return 28;//
        }
        if (month % 2 == 1)
        {
            return (31); //я то ставлю дужки то не ставлю. сподіваюсь, не проблема.
        }
        return 30;
    }

}
