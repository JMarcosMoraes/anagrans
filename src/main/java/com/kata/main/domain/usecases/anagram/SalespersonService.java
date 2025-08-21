package com.kata.main.domain.usecases.anagram;

import com.kata.main.domain.SalespersonRepository;
import com.kata.main.domain.model.Salesperson;
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

    public void updateSalespersonNamesWithAsterisk() {
        List<Salesperson> salespeople = salespersonRepository.findSalespeopleWithTwoOrMoreOrders();

        for (Salesperson s : salespeople) {
            if (!s.getName().endsWith("*")) {
                s.setName(s.getName() + "*");
                salespersonRepository.save(s);
            }
        }
    }

}
