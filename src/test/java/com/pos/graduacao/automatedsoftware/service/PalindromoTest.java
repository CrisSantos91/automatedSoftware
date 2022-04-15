package com.pos.graduacao.automatedsoftware.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    void isPalindromo() {
        Assertions.assertTrue(Palindromo.isPalindromo("Rotator"));
        Assertions.assertTrue(Palindromo.isPalindromo("bob"));
        Assertions.assertTrue(Palindromo.isPalindromo("madam"));
        Assertions.assertTrue(Palindromo.isPalindromo("mAlAyAlam"));
        Assertions.assertTrue(Palindromo.isPalindromo("1"));
        Assertions.assertTrue(Palindromo.isPalindromo("Able was I, ere I saw Elba"));
        Assertions.assertTrue(Palindromo.isPalindromo("Madam I’m Adam"));
        Assertions.assertTrue(Palindromo.isPalindromo("Step on no pets."));
        Assertions.assertTrue(Palindromo.isPalindromo("Top spot!"));
        Assertions.assertTrue(Palindromo.isPalindromo("02/02/2020"));
    }

    @Test
    void isNotPalindromo() {
        Assertions.assertFalse(Palindromo.isPalindromo("xyz"));
        Assertions.assertFalse(Palindromo.isPalindromo("elephant"));
        Assertions.assertFalse(Palindromo.isPalindromo("Country"));
        Assertions.assertFalse(Palindromo.isPalindromo("Top . post!"));
        Assertions.assertFalse(Palindromo.isPalindromo("Wonderful-fool"));
        Assertions.assertFalse(Palindromo.isPalindromo("Wild imagination!"));
    }
}
