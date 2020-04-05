package ro.fasttrackit.mvnbase.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.*;

class RecursionTest {
    Recursion recursion;

    @BeforeEach
    void setup() {
        recursion = new Recursion();
    }

    @Test
    @DisplayName("sum(1) = 1")
    void sum1() {
        assertThat(recursion.sum(1)).isEqualTo(1);
    }

    @Test
    @DisplayName("sum(0) = 0")
    void sum0() {
        assertThat(recursion.sum(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("sum(2) = 3")
    void sum2() {
        assertThat(recursion.sum(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("sum(-5) = exception")
    void invalidSum() {
        var exception = assertThrows(IllegalArgumentException.class, () -> recursion.sum(-5));
        assertThat(exception.getMessage()).isEqualTo("n should be positive");
    }

    @Test
    @DisplayName("sum(50) = 1275")
    void sum50() {
        assertThat(recursion.sum(50)).isEqualTo(1275);
    }

    @Test
    @DisplayName("evenSum(3) = 12")
    void evenSum3() {
        assertThat(recursion.sumOfFirstSetOfEvenNumbers(3)).isEqualTo(12);
    }

    @Test
    @DisplayName("firstSum(0) = 0")
    void firstSum0() {
        assertThat(recursion.sumOfFirstSetOfEvenNumbers(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("firstSum(-10) = exception")
    void invalidFirstSum() {
        var exception = assertThrows(IllegalArgumentException.class, () -> recursion.sumOfFirstSetOfEvenNumbers(-10));
        assertThat(exception.getMessage()).isEqualTo("n should be positive");
    }

    @Test
    @DisplayName("firstSum(10) = 110")
    void firstSum10() {
        assertThat(recursion.sumOfFirstSetOfEvenNumbers(10)).isEqualTo(110);
    }

    @Test
    @DisplayName("firstSum(5) = 30")
    void firstSum5() {
        assertThat(recursion.sumOfFirstSetOfEvenNumbers(5)).isEqualTo(30);
    }

    @Test
    @DisplayName("firstSum(50) = 2550")
    void firstSum50() {
        assertThat(recursion.sumOfFirstSetOfEvenNumbers(50)).isEqualTo(2550);
    }

    @Test
    @DisplayName("reverse(potato) = otatop")
    void reverse1() {
        assertThat(recursion.reverse("potato")).isEqualTo("otatop");
    }

    @Test
    @DisplayName("reverse(null) = exception")
    void reverseNull() {
        assertThrows(IllegalArgumentException.class, () -> recursion.reverse(null));
    }

    @Test
    @DisplayName("reverse(a) = a")
    void reverseLetter() {
        assertThat(recursion.reverse("a")).isEqualTo("a");
    }

    @Test
    @DisplayName("isPalindrome(radar) = true")
    void radarIsPalindrome() {
        assertThat(recursion.isPalindrome("radar")).isTrue();
    }

    @Test
    @DisplayName("isPalindrome(null) = exception")
    void nullPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> recursion.isPalindrome(null));
    }

    @Test
    @DisplayName("letterCheck(radar) = true")
    void letterCheck() {
        assertThat(recursion.letterCheck("radar")).isTrue();
    }

    @Test
    @DisplayName("letterCheck(null) = exception")
    void nullCheck() {
        assertThrows(IllegalArgumentException.class, () -> recursion.letterCheck(null));
    }

    @Test
    @DisplayName("letterCheck(b) = true")
    void oneLetterCheck() {
        assertThat(recursion.letterCheck("b")).isTrue();
    }

    @Test
    @DisplayName("digitSum(-12) = 3")
    void digitSum1() {
        assertThat(recursion.digitSum(-12)).isEqualTo(3);
    }

    @Test
    @DisplayName("digitSum(-5) = 5")
    void digitSum2() {
        assertThat(recursion.digitSum(-5)).isEqualTo(5);
    }

    @Test
    @DisplayName("digitSum(0) = 0")
    void digitSumZero() {
        assertThat(recursion.digitSum(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("digitSum(-64850) = 23")
    void digitSum3() {
        assertThat(recursion.digitSum(-64850)).isEqualTo(23);
    }

    @Test
    @DisplayName("digitSum(945876541) = 49")
    void digitSum4() {
        assertThat(recursion.digitSum(945876541)).isEqualTo(49);
    }

    @Test
    @DisplayName("evenSum(0) = 0")
    void evenSum0() {
        assertThat(recursion.evenSum(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("evenSum(5) = 6")
    void evenSum5() {
        assertThat(recursion.evenSum(5)).isEqualTo(6);
    }

    @Test
    @DisplayName("evenSum(1) = 0")
    void evenSum1() {
        assertThat(recursion.evenSum(1)).isEqualTo(0);
    }

    @Test
    @DisplayName("evenSum(-15) = exception")
    void invalidEvenSum() {
        assertThrows(IllegalArgumentException.class, () -> recursion.evenSum(-15));
    }

    @Test
    @DisplayName("evenSum(20) = 110")
    void evenSum20() {
        assertThat(recursion.evenSum(20)).isEqualTo(110);
    }

}