package com.kata.main.domain.usecases.anagram;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramServiceTest {

    private final AnagramService service = new AnagramService();

    @Test
    void shouldGenerateAllAnagramsForValidInput() {
        // Arrange
        String input = "abc";

        // Act
        List<String> result = service.generateAnagrams(input);

        // Assert
        assertEquals(6, result.size()); // 3! = 6
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("cab"));
    }

    @Test
    void shouldThrowExceptionForEmptyInput() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.generateAnagrams("")
        );
        assertEquals("A entrada não pode ser vazia.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForNullInput() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.generateAnagrams(null)
        );
        assertEquals("A entrada não pode ser vazia.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForInputWithNumbers() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.generateAnagrams("abc123")
        );
        assertEquals("A entrada deve conter apenas letras.", exception.getMessage());
    }

    @Test
    void shouldGenerateOneAnagramForSingleLetter() {
        List<String> result = service.generateAnagrams("a");
        assertEquals(List.of("a"), result);
    }
}
