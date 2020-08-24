package ua.stepess.java.course.first.condiitonal;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;

public class QuadraticEquitationSolverTest {

    private final QuadraticEquitationSolver solver = new QuadraticEquitationSolver();

    @Test
    public void shouldSolve1() {
        int a = 1;
        int b = 5;
        int c = 1;

        double[] roots = solver.solve(a, b, c);

        double[] expectedRoots = {-0.20871215252208009, -4.7912878474779195};
        Arrays.sort(roots);
        Arrays.sort(expectedRoots);
        assertArrayEquals(expectedRoots, roots, 0.001);
    }

    @Test
    public void shouldSolve2() {
        int a = 1;
        int b = 7;
        int c = 3;

        double[] roots = solver.solve(a, b, c);

        double[] expectedRoots = {-0.45861873485089033, -6.541381265149109};
        Arrays.sort(roots);
        Arrays.sort(expectedRoots);
        assertArrayEquals(expectedRoots, roots, 0.001);
    }

    @Test
    public void shouldSolve3() {
        int a = 1;
        int b = -6;
        int c = 9;

        double[] roots = solver.solve(a, b, c);

        double[] expectedRoots = {0, 3};
        Arrays.sort(roots);
        Arrays.sort(expectedRoots);
        assertArrayEquals(expectedRoots, roots, 0.001);
    }

    @Test
    public void shouldSolve4() {
        int a = 5;
        int b = 3;
        int c = 7;

        double[] roots = solver.solve(a, b, c);

        double[] expectedRoots = new double[2];
        Arrays.sort(roots);
        Arrays.sort(expectedRoots);
        assertArrayEquals(expectedRoots, roots, 0.001);
    }
}