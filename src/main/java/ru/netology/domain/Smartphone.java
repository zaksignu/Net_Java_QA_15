package ru.netology.domain;

public class Smartphone extends Product {

    private String smartphoneManufacturer;

    public Smartphone(int id, String productName, int price, String smartphoneManufacturer) {
        super(id, productName, price);
        this.smartphoneManufacturer = smartphoneManufacturer;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return true;
        }
        if (smartphoneManufacturer.contains(search)) {
            return true;
        }
        return false;
    }
}
