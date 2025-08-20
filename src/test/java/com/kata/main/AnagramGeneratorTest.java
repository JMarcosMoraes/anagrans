package com.kata.main;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramGeneratorTest {

    @Test
    public void testThreeLetters() {
        List<String> result = AnagramGenerator.generateAnagrams("abc");
        assertEquals(6, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("cba"));
    }

    @Test
    public void testSingleLetter() {
        List<String> result = AnagramGenerator.generateAnagrams("x");
        assertEquals(1, result.size());
        assertEquals("x", result.get(0));
    }

    @Test
    public void testEmptyInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AnagramGenerator.generateAnagrams("");
        });
        assertEquals("A entrada não pode ser vazia.", exception.getMessage());
    }

    @Test
    public void testInvalidCharacters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AnagramGenerator.generateAnagrams("a1b");
        });
        assertEquals("A entrada deve conter apenas letras.", exception.getMessage());
    }
}
