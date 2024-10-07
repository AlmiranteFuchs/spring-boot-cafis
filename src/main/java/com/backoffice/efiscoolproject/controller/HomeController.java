package com.backoffice.efiscoolproject.controller;


import com.backoffice.efiscoolproject.entity.Coffee;
import com.backoffice.efiscoolproject.entity.UserEntity;
import com.backoffice.efiscoolproject.service.CoffeeService;
import com.backoffice.efiscoolproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private CoffeeService coffeeService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String getHomePage() {
        return "home/home_page";
    }

    @GetMapping("/test")
    public String test(Model model) {
        List<Coffee> coffees = coffeeService.getCoffeesByCategoryName("cappuccino");
        model.addAttribute("coffeesAll", coffees);

        Map<String, List<Coffee>> coffeByCategory = coffeeService.groupCoffeesByCategoryName();
        model.addAttribute("coffeByCategory", coffeByCategory);


        Coffee coffee = coffees.get(0);
        coffeeService.updateCoffeStock(coffee, coffee.getOn_stock() - 10);

        List<Coffee> coffees_again = coffeeService.getCoffeesByCategoryName("cappuccino");
        coffee = coffees_again.get(0);

        System.out.println(coffee.getOn_stock() + " " +coffee.getName());


        return "home/home_page";
    }

}
