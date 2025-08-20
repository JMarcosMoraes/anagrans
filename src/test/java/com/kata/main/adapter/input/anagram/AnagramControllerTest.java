package com.kata.main.adapter.input.anagram;

import com.kata.main.domain.usecases.anagram.AnagramService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AnagramControllerTest {

    @Mock
    private AnagramService service;

    @InjectMocks
    private AnagramController controller;

    @Test
    void shouldReturnAnagramsForGivenInput() {
        // Arrange
        String input = "abc";
        List<String> expected = List.of("abc", "acb",
                "bac", "bca", "cab", "cba");

        when(service.generateAnagrams(input)).thenReturn(expected);

        // Act
        List<String> result = controller.getAnagrams(input);

        // Assert
        assertEquals(expected, result);
    }
}
