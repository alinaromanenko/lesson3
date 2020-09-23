package lesson3;

public class Ex6 {
    public static void main(String[] args) {
        Product product1 = new Product(123, "Cheese", 10, "Yellow");
        Product product2 = new Product(124, "Milk", 5, "White");
        ProductCatalog catalog = new ProductCatalog();

        System.out.println("Добавление продукта:\n");
        try {
            catalog.createProduct(product1);
            catalog.createProduct(product2);
            //catalog.createProduct(product1);
        } catch (ProductAlreadyExists error) {
            error.printStackTrace();
        }
        for (Product product : catalog.getAllProducts()) {
            product.productInfo();
            System.out.println("____");
        }
        Product product3 = new Product(123, "Cheese", 10, "Holes");
        Product product4 = new Product(129, "Chocolate", 7, "Sweet");
        Product product5 = new Product(123, "", 10, "Holes");

        System.out.println("Обнавление продукта:\n");
        try{
        catalog.updateProduct(product3);
        //catalog.updateProduct(product5);
        //catalog.updateProduct(product4);
        }catch (ProductNotValid error){
            error.printStackTrace();
        }
        for (Product product : catalog.getAllProducts()) {
            product.productInfo();
            System.out.println("____");
        }

        System.out.println("Удаление продукта:\n");
        catalog.deleteProduct(123);
        for (Product product : catalog.getAllProducts()) {
            product.productInfo();
            System.out.println("____");
        }
    }
}
