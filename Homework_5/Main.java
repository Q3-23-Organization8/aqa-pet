package Homework_5;

public class Main {
    public static void main(String[] args) {
        String str = "pylyp";

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // We convert the string into an array of characters
        char[] charArray = str.toCharArray();
        int length = charArray.length;

        // We check whether the string is a palindrome
        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[length - 1 - i]) {
                return false; // If the characters do not match, then the string is not a palindrome
            }
        }

        return true; // If all characters match, then the string is a palindrome
    }
}

