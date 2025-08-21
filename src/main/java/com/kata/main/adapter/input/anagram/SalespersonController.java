package com.kata.main.adapter.input.anagram;

import com.kata.main.domain.usecases.anagram.SalespersonService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/salespersons")
public class SalespersonController {

    @Autowired
    private SalespersonService salespersonService;

    @GetMapping("/no-orders-to-samsonic")
    public List<String> getSalespersonsWithoutOrdersToSamsonic() {
        return salespersonService.getSalespersonsWithoutOrdersToSamsonic();
    }
}
