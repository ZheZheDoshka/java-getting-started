package ua.stepess.java.course.first.condiitonal;

/**
 * Should solve quadratic equitation like:
 *      ax^2 + bx + c = 0
 * Class accepts value of coefficients a,b,c and returns array with roots.
 */
public class QuadraticEquitationSolver {

    public double[] solve(int a, int b, int c) {
        //TODO: write code here

        double[] roots = new double[2];
        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            roots[0] = r1;
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            roots[1] = r2;
            System.out.println("The roots are " + r1 + " and " + r2);

        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            roots[0] = r1;
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }

        return roots;
    }

}
