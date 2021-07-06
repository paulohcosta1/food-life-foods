package com.foodlife.foods.exceptions;

public class FoodNotFoundException extends  FoodException {


    public FoodNotFoundException(String foodId) {
        super(String.format("Food with ID '%s' not found", foodId));
    }

}
