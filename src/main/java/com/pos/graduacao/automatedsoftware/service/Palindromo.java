package com.pos.graduacao.automatedsoftware.service;

import java.util.Locale;

public class Palindromo {
    public static boolean isPalindromo(String palindromo) {
//        https://www.javatpoint.com/how-to-remove-special-characters-from-string-in-java

        if (palindromo == null || palindromo.isBlank() || palindromo.isEmpty())
            throw new RuntimeException("Campo: " + palindromo + " está vazio, em branco ou nulo");

        System.out.println(palindromo);
        String palidromoSemEspacos = palindromo.toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(palidromoSemEspacos);

        for (int i = 0, j = palidromoSemEspacos.length() - 1; i < palidromoSemEspacos.length() & j >= 0; i++, j--) {
            if (palidromoSemEspacos.charAt(i) != palidromoSemEspacos.charAt(j)) return false;
        }

        return true;
    }
}
