package ru.netology;

public class ProductRepository {

    private Product[] things = new Product[0];

    public void addProduct(Product thing) {
        int length = things.length + 1;
        Product[] tmp = new Product[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = things[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = thing;
        things = tmp;

    }

    public Product[] showThings() {
        return things;
    }

    public void removeThing(int id) {
        int length;
        int p = 0;
        length = things.length - 1;
        Product[] tmp = new Product[length];
        for (int i = 0; i <= length; i++) {
            if (id != things[i].getId()) {
                tmp[p] = things[i];
                p++;
            }
        }
        things = tmp;

    }
}

