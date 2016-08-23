package za.co.yourinventory.factories;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.co.yourinventory.domain.ShoppingCart;

/**
 * Created by Rosie on 2016/08/21.
 */
public class ShoppingCartFactoryTest extends TestCase {

    public void testCreateShopping() throws Exception {

        ShoppingCart cart = ShoppingCartFactory.createShopping(90);
        Assert.assertEquals(90, cart.getQuantity());
    }
}