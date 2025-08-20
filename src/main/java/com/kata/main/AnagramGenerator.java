package com.kata.main;
import java.util.ArrayList;
import java.util.List;

public class AnagramGenerator {

    /**
     * Gera todos os anagramas possíveis a partir de uma string de letras distintas.
     *
     * @param input String contendo apenas letras distintas
     * @return Lista de anagramas gerados
     * @throws IllegalArgumentException se a entrada for inválida
     */
    public static List<String> generateAnagrams(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("A entrada não pode ser vazia.");
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("A entrada deve conter apenas letras.");
        }

        List<String> result = new ArrayList<>();
        permute("", input, result);
        return result;
    }

    /**
     * Função recursiva para gerar permutações.
     *
     * @param prefix   Parte já construída do anagrama
     * @param remaining Letras restantes para permutar
     * @param result   Lista acumuladora de resultados
     */
    private static void permute(String prefix, String remaining, List<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String nextPrefix = prefix + remaining.charAt(i);
                String nextRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                permute(nextPrefix, nextRemaining, result);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> anagrams = generateAnagrams(input);
        System.out.println("Anagramas de '" + input + "': " + anagrams);
    }
}
