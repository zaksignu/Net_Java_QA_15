package ru.netology.domain;

public class Smartphone extends Product {

    private String smartphoneManufacturer;

    public Smartphone(int id, String productName, int price, String smartphoneManufacturer) {
        super(id, productName, price);
        this.smartphoneManufacturer = smartphoneManufacturer;
    }
}
