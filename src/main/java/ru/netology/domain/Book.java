package ru.netology.domain;

public class Book extends Product {


    private String bookAuthor;

    public Book(int id, String productName, int price, String bookAuthor) {
        super(id, productName, price);
        this.bookAuthor = bookAuthor;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return true;
        }
        if (bookAuthor == search) {
            return true;
        };
        return false;
    }
}

