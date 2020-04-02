package ro.fasttrackit.mvnbase.homework;

public class Recursion {

    public int sum(int n) {
        if (n < 0) throw new IllegalArgumentException("n should be positive");
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }

    public int evenSum(int n) {
        if (n < 0) throw new IllegalArgumentException("n should be positive");
        if (n == 0) {
            return 0;
        } else {
            return n * 2 + evenSum(n - 1);
        }
    }

    public boolean isPalindrome(String word) {
        return word.equals(reverse(word));
    }

    public String reverse(String word) {
        if (word == null) throw new IllegalArgumentException();
        if (word.length() <= 1) {
            return word;
        } else {
            return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
        }
    }

    public boolean letterCheck(String word) {
        if (word == null) throw new IllegalArgumentException();
        if (word.length() <= 1) {
            return true;
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return letterCheck(word.substring(1, word.length() - 1));
        }
        return false;
    }

    public int digitSum(int n) {
        if (n < 10 && n > -10) {
            return Math.abs(n);
        } else {
            return Math.abs(n % 10) + digitSum(n / 10);
        }
    }
}
