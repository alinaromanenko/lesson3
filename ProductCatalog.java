package lesson3;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product> catalog = new ArrayList<>();

    public List<Product> getAllProducts() {
        return catalog;
    }

    public void createProduct(Product product) throws ProductAlreadyExists {
        if (catalog.indexOf(product) != -1) throw new ProductAlreadyExists("Product already exists");
        else catalog.add(product);
    }

    public void updateProduct(Product product) throws ProductNotValid {
        List<Long> ids = new ArrayList<>();
        for (Product catalogProduct : catalog) {
            ids.add(catalogProduct.getId());
        }
        if (ids.contains(product.getId())) {
            if (product.getName().equals("")) throw new ProductNotValid("Name is not set");
            catalog.add(ids.indexOf(product.getId()), product);
            catalog.remove(ids.indexOf(product.getId())+1);
        } else throw new ProductNotFound("Product doesn't exist");
    }

    public void deleteProduct(long id) {
        boolean isRemoved = false;
        for (Product catalogProduct : catalog) {
            if (catalogProduct.getId() == id) {
                catalog.remove(catalogProduct);
                isRemoved = true;
            }
        }
        if (!isRemoved) {
            throw new ProductNotFound("Product doesn't exist");
        }

    }
}
