package ru.netology;

public class ProductManager {
    private ProductRepository thingsManager;

    public ProductManager(ProductRepository thingsManager) {
        this.thingsManager = thingsManager;

    }

    public void add (Product product){
        thingsManager.addProduct(product);
    }

    public void search () {
     thingsManager.showThings();
    }
    public void removeById (int id) {
        thingsManager.removeThing(id);
    }

    public Product[] searchBy(String text) {
        int length = 0;
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product: thingsManager.showThings()) {
            if (matches(product, text)) {
                length++;
                Product[] tmpsearch = new Product[length];
                int  i = 0;
                for(Product productSearch:result) {
                /*
                for (int i = 0; i <= length-1; i++) {
                    tmpsearch[i] = result[i];
                }

                 */
                    tmpsearch[i] = result[i];
                    i++;
                }
                int lastIndex = length - 1;
                tmpsearch[lastIndex] = product;
                result = tmpsearch;
                // "добавляем в конец" массива result продукт product
            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
        if (product.getProductName().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getName().contains(search);
    }

    /*
    Разработайте менеджера, который умеет добавлять Product'ы в репозиторий и осуществлять
    поиск по ним.
    Для этого вам нужно создать класс,
    конструктор которого будет принимать параметром репозиторий,
     а также с методом publiс void add(Product product) и методом поиска (см. ниже).
     */




}
