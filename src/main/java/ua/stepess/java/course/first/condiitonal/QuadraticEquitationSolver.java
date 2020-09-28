package ua.stepess.java.course.first.condiitonal;

/**
 * Should solve quadratic equitation like:
 *      ax^2 + bx + c = 0
 * Class accepts value of coefficients a,b,c and returns array with roots.
 * You should return empty array in case if equitation haven't any roots.
 * In case of single root you should return array with this root and zeros.
 */
public class QuadraticEquitationSolver {

    public double[] solve(int a, int b, int c) {
        double d = b*b - 4*a*c;
        if (d<0)
        {return new double[2];} //exits if there are no roots. also, it screams on me. Empty array is a lie
        d = Math.sqrt(d); //called the square root function for d here to call less later
        double x[] = new double [2]; //created root massive.
        x[0] = (d - b) / (2*a);
        if (d == 0) { x[1] = 0; }
        else { x[1] = (-b - d) / (2*a); }
        return x;
    }

}
