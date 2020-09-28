package ua.stepess.java.course.first.cycle;

/**
 * Should sum all elements of the massive
 */
public class MyAwesomeSumator {

    public int sum(int[] nums) {
        // TODO: write here
        int x = 0; //sum
        int size = nums.length;
        for (int i = 0; i<size; i++)
        { x = x + nums[i]; } //doing sum
        return x;
    }

}
