package com.foodlife.foodsservice.api;

import com.foodlife.foodsservice.domain.models.Food;
import com.foodlife.foodsservice.domain.repositories.FoodRepository;
import com.foodlife.foodsservice.domain.services.SearchFoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/foods")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private SearchFoods searchFoods;

    @GetMapping
    public List<Food> listar() {
        List foods = new ArrayList();

        Food f1 = new Food("teste",1.0,5.0,5.0,5.0,6 );
        Food f2 = new Food("teste2",1.0,5.0,5.0,5.0,6 );

        foods.add(f1);
        foods.add(f2);

        return foods;
    }
}
