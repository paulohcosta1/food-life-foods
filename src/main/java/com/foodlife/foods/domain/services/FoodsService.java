package com.foodlife.foods.domain.services;

import com.foodlife.foods.domain.models.Food;
import com.foodlife.foods.domain.repositories.FoodRepository;
import com.foodlife.foods.exceptions.FoodNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodsService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> findAll() {
        return foodRepository.findAll();
    }
    public Food findOrFail(String foodId) {
        return foodRepository.findById(foodId)
                .orElseThrow(() -> new FoodNotFoundException(foodId));
    }
    public List<Food> findByFoodName(String foodName){
        return foodRepository.findByFoodName(foodName);
    }

}
