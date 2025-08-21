package com.kata.main.domain;

import com.kata.main.domain.model.Salesperson;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface SalespersonRepository extends CrudRepository<Salesperson, Long> {

    @Query("""
        SELECT s.name
        FROM Salesperson s
        WHERE s.id NOT IN (
            SELECT o.salesperson.id
            FROM Order o
            WHERE o.customer.name = 'Samsonic'
        )
    """)
    List<String> findSalespersonsWithoutOrdersToSamsonic();
}
