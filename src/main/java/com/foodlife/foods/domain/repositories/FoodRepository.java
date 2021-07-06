package com.foodlife.foods.domain.repositories;

import com.foodlife.foods.domain.models.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface FoodRepository extends MongoRepository<Food, String> {
    @Query("{'name': {$regex: ?0 }})")
    List<Food> findByFoodName(String foodName);

}
