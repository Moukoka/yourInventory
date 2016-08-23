package za.co.yourinventory.factories;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.co.yourinventory.domain.Product;

/**
 * Created by Rosie on 2016/08/21.
 */
public class ProductFactoryTest extends TestCase {

    public void testCreateProduct() throws Exception {

        Product product = ProductFactory.createProduct("Cappuccino");
        Assert.assertEquals("Cappuccino", product.getName());
    }
}