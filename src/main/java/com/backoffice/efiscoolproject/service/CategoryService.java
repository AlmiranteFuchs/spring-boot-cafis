package com.backoffice.efiscoolproject.service;

import com.backoffice.efiscoolproject.entity.Category;
import com.backoffice.efiscoolproject.entity.Coffee;
import com.backoffice.efiscoolproject.repository.CategoryRepository;
import com.backoffice.efiscoolproject.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCoffees() {
        return categoryRepository.findAll();
    }

    public List<Category> getCoffeesByCategoryName(String category) {
        return categoryRepository.findByCategoryName(category);
    }

}