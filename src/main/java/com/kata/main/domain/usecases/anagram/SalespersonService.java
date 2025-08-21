package com.kata.main.domain.usecases.anagram;

import com.kata.main.domain.SalespersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class SalespersonService {

    @Autowired
    private SalespersonRepository salespersonRepository;

    public List<String> getSalespersonsWithoutOrdersToSamsonic() {
        return salespersonRepository.findSalespersonsWithoutOrdersToSamsonic();
    }
}
