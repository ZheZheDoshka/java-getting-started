package ua.stepess.java.course.first.cycle;

/**
 * should find sum of first N odd numbers:
 *
 * Input number of terms is: 5
 *
 * The odd numbers are :
 * 1
 * 3
 * 5
 * 7
 * 9
 *
 * The Sum of odd Natural Number upto 5 terms is: 25
 */
public class LimitedOddNumbersSumator {

    public int sum(int limit) {
        int x = 0;
        int q = 1;
        for (int i = 0; i<limit; i++)
        {
            x = x + q; //add odd number
            q = q + 2; //increase odd number
        }
        return x;
    }

}
