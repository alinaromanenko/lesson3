package lesson3;

public class Ex6 {
    public static void main(String[] args) {
        Product product1 = new Product(123, "Cheese", 10, "Yellow");
        Product product2 = new Product(124, "Milk", 5, "White");
        ProductCatalog catalog = new ProductCatalog();
        try {
            catalog.createProduct(product1);
            catalog.createProduct(product2);
        } catch (ProductAlreadyExists error) {
            error.printStackTrace();
        }
        for (Product product : catalog.getAllProducts()) {
            product.productInfo();
            System.out.println("____");
        }
    }
}
