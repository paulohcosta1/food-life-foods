package com.foodlife.foods.exceptions;

public class FoodException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public FoodException(String msg) {
        super(msg);
    }

    public FoodException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
