package ua.stepess.java.course.first.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import ua.stepess.java.course.first.string.PalindromeDetector;

public class PalindromeDetectorTest {

    private final PalindromeDetector detector = new PalindromeDetector();

    @Test
    public void shouldDetect1() {
        String string = "mom";

        boolean isPalindrome = detector.isPalindrome(string);

        assertEquals(true, isPalindrome);
    }

    @Test
    public void shouldDetect2() {
        String string = "Mom";

        boolean isPalindrome = detector.isPalindrome(string);

        assertEquals(true, isPalindrome);
    }

    @Test
    public void shouldDetect3() {
        String string = "cat";

        boolean isPalindrome = detector.isPalindrome(string);

        assertEquals(false, isPalindrome);
    }

    @Test
    public void shouldDetect4() {
        String string = "was saw";

        boolean isPalindrome = detector.isPalindrome(string);

        assertEquals(true, isPalindrome);
    }

    @Test
    public void shouldDetect5() {
        String string = "aaaa";

        boolean isPalindrome = detector.isPalindrome(string);

        assertEquals(true, isPalindrome);
    }

    @Test
    public void shouldDetect6() {
        String string = "Hello World!";

        boolean isPalindrome = detector.isPalindrome(string);

        assertEquals(false, isPalindrome);
    }
}