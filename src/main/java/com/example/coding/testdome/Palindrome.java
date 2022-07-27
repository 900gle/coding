package com.example.coding.testdome;

/*

Write a function that checks if a given sentence is a palindrome. A palindrome is a word, phrase, verse, or sentence that reads the same backward or forward.
Only the order of English alphabet letters (A-Z and a-z) should be considered, other characters should be ignored.

        For example, IsPalindrome("Noel sees Leon.") should return true as spaces, period and case should be ignored resulting with "noelseesleon" which is a palindrome since it reads same backward and forward.
*/

import java.util.regex.Pattern;

public class Palindrome {


    public static boolean isPalindrome(String word) {

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : word.toCharArray()) {

            String sc = String.valueOf(c);
            if (Pattern.matches("^[a-zA-Z]*$", sc)) {
                stringBuilder.append(sc);
            }
        }

        word = stringBuilder.toString().toLowerCase();
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt((length - 1) - i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Noel sees Leon."));
    }
}
