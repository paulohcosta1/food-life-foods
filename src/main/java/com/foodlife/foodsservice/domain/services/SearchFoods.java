package com.foodlife.foodsservice.domain.services;

import com.foodlife.foodsservice.domain.models.Food;
import com.foodlife.foodsservice.infra.db.FoodRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SearchFoods {
    public SearchFoods(FoodRepositoryImpl foodRepositoryImpl) {
        this.foodRepositoryImpl = foodRepositoryImpl;
    }

    private FoodRepositoryImpl foodRepositoryImpl;
    public Optional<Food> search(String id) {
        return foodRepositoryImpl.findById(id);
    }
}
