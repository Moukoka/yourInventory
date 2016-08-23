package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Product;

/**
 * Created by Rosie on 2016/08/21.
 */
public class ProductFactory {
    public static Product createProduct(String name){
        Product product = new Product.Builder().name(name).build();
        return product;
    }
}
