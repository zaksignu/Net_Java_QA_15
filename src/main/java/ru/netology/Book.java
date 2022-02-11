package ru.netology;

public class Book extends Product {

    private String bookName;
    private String bookAuthor;

    public Book(int id, String productName, int price, String bookName, String bookAuthor) {
        super(id, productName, price);
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
}

