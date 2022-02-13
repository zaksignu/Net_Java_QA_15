package ru.netology;

public class ProductManager {
    private ProductRepository thingsManager;

    public ProductManager(ProductRepository thingsManager) {
        this.thingsManager = thingsManager;
    }

    public void add(Product product) {
        thingsManager.addProduct(product);
    }

    public void removeById(int id) {
        thingsManager.removeThing(id);
    }

    public Product[] searchBy(String text) {
        int length = 0;
        Product[] result = new Product[0];
        for (Product product : thingsManager.showThings()) {
            if (matches(product, text)) {
                length++;
                Product[] tmpsearch = new Product[length];
                int i = 0;
                for (Product productSearch : result) {
                    tmpsearch[i] = result[i];
                    i++;
                }
                int lastIndex = length - 1;
                tmpsearch[lastIndex] = product;
                result = tmpsearch;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product.getProductName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }

}
