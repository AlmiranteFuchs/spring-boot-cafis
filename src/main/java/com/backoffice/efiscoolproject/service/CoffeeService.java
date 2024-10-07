package com.backoffice.efiscoolproject.service;

import com.backoffice.efiscoolproject.entity.Category;
import com.backoffice.efiscoolproject.entity.Coffee;
import com.backoffice.efiscoolproject.repository.CoffeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CoffeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private CoffeeRepository coffeeRepository;

    public List<Coffee> getAllCoffees() {
        return coffeeRepository.findAll();
    }

    public List<Coffee> getCoffeesByCategoryName(String category) {
        return coffeeRepository.findByCategory_categoryName(category);
    }

    @Transactional
    public int updateCoffeStock(Coffee coffee, int quantity) {
        if(quantity < 0){
            //Throw
            return 0;
        }

        int affected = coffeeRepository.updateCoffeStock(coffee.getId(), quantity);
        if(affected > 0) {
            entityManager.refresh(coffee);
        }

        return affected;
    }

    public Map<String, List<Coffee>> groupCoffeesByCategoryName() {
        List<Coffee> coffees = coffeeRepository.findAll(); // Fetch all coffees

        // Grouping by category name using the Stream API
        Map<String, List<Coffee>> grouped_coffees = coffees.stream()
                .collect(Collectors.groupingBy(coffee -> coffee.getCategory().getCategoryName().substring(0, 1).toUpperCase() + coffee.getCategory().getCategoryName().substring(1)));

        return grouped_coffees.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size())  // Sorting by list size in descending order
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .peek(coffee -> {
                                    coffee.setName(coffee.getName().substring(0, 1).toUpperCase() + coffee.getName().substring(1));
                                })
                                .collect(Collectors.toList()),  // Collect the modified coffees into a list
                        (oldValue, newValue) -> oldValue,  // Merge function, not used here
                        LinkedHashMap::new  // Collect into LinkedHashMap
                ));
    }


}

