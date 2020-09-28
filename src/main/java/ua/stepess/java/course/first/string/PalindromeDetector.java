package ua.stepess.java.course.first.string;

/**
 * Should return true if provided string is palindrome ignoring case or false otherwise.
 *
 * Examples:
 *  - mom -- true;
 *  - Mom -- true;
 *  - cat -- false;
 */
public class PalindromeDetector {

    public boolean isPalindrome(String string) //
    {
        String str = string.toLowerCase(); //thanks book
        int length = str.length();
        int half = length/2;
        for (int i=0; i<half; i++) //compare symbols from first half to 2nd
        {
            if (str.charAt(i)!=str.charAt(length-i-1)) {return false;}
        }
        return true;
    }

}
