package com.foodlife.foodsservice.domain.repositories;

import com.foodlife.foodsservice.domain.models.Food;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
public interface FoodRepository extends MongoRepository<Food, String> {
    List<Food> findAll();
}
