package com.pos.graduacao.automatedsoftware.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;

public class PalindromoTest {

    @Test
    void isPalindromo() {
        assertTrue(Palindromo.isPalindromo("Rotator"));
        assertTrue(Palindromo.isPalindromo("bob"));
        assertTrue(Palindromo.isPalindromo("madam"));
        assertTrue(Palindromo.isPalindromo("mAlAyAlam"));
        assertTrue(Palindromo.isPalindromo("1"));
        assertTrue(Palindromo.isPalindromo("Able was I, ere I saw Elba"));
        assertTrue(Palindromo.isPalindromo("Madam I’m Adam"));
        assertTrue(Palindromo.isPalindromo("Step on no pets."));
        assertTrue(Palindromo.isPalindromo("Top spot!"));
        assertTrue(Palindromo.isPalindromo("02/02/2020"));
    }

    @Test
    void isNotPalindromo() {
        assertFalse(Palindromo.isPalindromo("xyz"));
        assertFalse(Palindromo.isPalindromo("elephant"));
        assertFalse(Palindromo.isPalindromo("Country"));
        assertFalse(Palindromo.isPalindromo("Top . post!"));
        assertFalse(Palindromo.isPalindromo("Wonderful-fool"));
        assertFalse(Palindromo.isPalindromo("Wild imagination!"));
    }

    @Test
    void isOrNotPalindromo() {
        assertAll("valida de uma só vez o que é ou não um Palindromo",
                () -> assertTrue(Palindromo.isPalindromo("Rotator")),
                () -> assertTrue(Palindromo.isPalindromo("bob")),
                () -> assertTrue(Palindromo.isPalindromo("madam")),
                () -> assertTrue(Palindromo.isPalindromo("mAlAyAlam")),
                () -> assertTrue(Palindromo.isPalindromo("1")),
                () -> assertTrue(Palindromo.isPalindromo("Able was I, ere I saw Elba")),
                () -> assertTrue(Palindromo.isPalindromo("Madam I’m Adam")),
                () -> assertTrue(Palindromo.isPalindromo("Step on no pets.")),
                () -> assertTrue(Palindromo.isPalindromo("Top spot!")),
                () -> assertTrue(Palindromo.isPalindromo("02/02/2020")),
                () -> assertFalse(Palindromo.isPalindromo("xyz")),
                () -> assertFalse(Palindromo.isPalindromo("elephant")),
                () -> assertFalse(Palindromo.isPalindromo("Country")),
                () -> assertFalse(Palindromo.isPalindromo("Top . post!")),
                () -> assertFalse(Palindromo.isPalindromo("Wonderful-fool")),
                () -> assertFalse(Palindromo.isPalindromo("Wild imagination!"))
        );
    }
}
