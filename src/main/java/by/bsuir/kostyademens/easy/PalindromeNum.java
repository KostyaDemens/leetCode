package by.bsuir.kostyademens.easy;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNum {

    public static boolean isPalindrome(int x) {
        String normalNum = String.valueOf(x);

        StringBuilder reverse = new StringBuilder(normalNum).reverse();

        return normalNum.contentEquals(reverse);
    }
}
