package com.kata.main.adapter.input.anagram;
import com.kata.main.domain.usecases.anagram.AnagramService;
import com.kata.main.port.input.usecases.AnagramUseCase;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/anagrams")
public class AnagramController {

    private final AnagramUseCase service;

    public AnagramController(AnagramService service) {
        this.service = service;
    }

    @GetMapping("/{input}")
    public List<String> getAnagrams(@PathVariable String input) {
        return service.generateAnagrams(input);
    }
}
