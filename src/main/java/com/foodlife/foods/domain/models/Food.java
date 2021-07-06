package com.foodlife.foods.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "paco-foods-2020")
public class Food {
    @Id
    private String id;
    private String name;
    private Number quantity;
    private Number carb;
    private Number protein;
    private Number fat;

    public Food(String id, String name, Number quantity, Number carb, Number protein, Number fat) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public Number getCarb() {
        return carb;
    }

    public void setCarb(Number carb) {
        this.carb = carb;
    }

    public Number getProtein() {
        return protein;
    }

    public void setProtein(Number protein) {
        this.protein = protein;
    }

    public Number getFat() {
        return fat;
    }

    public void setFat(Number fat) {
        this.fat = fat;
    }

}
