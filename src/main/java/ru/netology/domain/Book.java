package ru.netology.domain;

public class Book extends Product {


    private String bookAuthor;

    public Book(int id, String productName, int price, String bookAuthor) {
        super(id, productName, price);
        this.bookAuthor = bookAuthor;
    }
}

