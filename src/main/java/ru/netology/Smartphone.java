package ru.netology;

public class Smartphone extends Product {

    private String smartphoneName;
    private String smartphoneManufacturer;

    public Smartphone(int id, String productName, int price, String smartphoneName, String smartphoneManufacturer) {
        super(id, productName, price);
        this.smartphoneName = smartphoneName;
        this.smartphoneManufacturer = smartphoneManufacturer;
    }
}
