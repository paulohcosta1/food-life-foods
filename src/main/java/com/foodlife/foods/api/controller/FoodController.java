package com.foodlife.foods.api.controller;

import com.foodlife.foods.domain.models.Food;
import com.foodlife.foods.domain.repositories.FoodRepository;
import com.foodlife.foods.domain.services.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/foods")
public class FoodController {

    @Autowired
    private FoodsService foodsService;

    @GetMapping
    public List<Food> listar() {
        return foodsService.findAll();
    }

    @GetMapping("{foodId}")
    public Food buscar(@PathVariable String foodId) {
        return foodsService.findOrFail(foodId);
    }


}
