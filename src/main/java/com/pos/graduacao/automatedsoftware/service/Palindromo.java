package com.pos.graduacao.automatedsoftware.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Palindromo {
    public static boolean isPalindromo(String palindromo) {
//        https://www.javatpoint.com/how-to-remove-special-characters-from-string-in-java

        if (palindromo == null || palindromo.isBlank() || palindromo.isEmpty())
            throw new RuntimeException("Campo: " + palindromo + " está vazio, em branco ou nulo");

        String b = palindromo.trim().toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(b);

        for (int i = 0, j = b.length() - 1; i < b.length() & j >= 0; i++, j--) {
            if (b.charAt(i) != b.charAt(j)) return false;
        }

        return true;
    }
}
