package com.foodlife.foodsservice.domain.models;

import org.springframework.data.annotation.Id;

public class Food {
    @Id
    private String id;
    private String name;
    private Number quantity;
    private Number carb;
    private Number prot;
    private Number fat;
    private Number fiber;

    public Food(String name, Number quantity, Number carb, Number prot, Number fat, Number fiber) {
        this.name = name;
        this.quantity = quantity;
        this.carb = carb;
        this.prot = prot;
        this.fat = fat;
        this.fiber = fiber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Number getProt() {
        return prot;
    }

    public void setProt(Number prot) {
        this.prot = prot;
    }

    public Number getFat() {
        return fat;
    }

    public void setFat(Number fat) {
        this.fat = fat;
    }

    public Number getFiber() {
        return fiber;
    }

    public void setFiber(Number fiber) {
        this.fiber = fiber;
    }
}
