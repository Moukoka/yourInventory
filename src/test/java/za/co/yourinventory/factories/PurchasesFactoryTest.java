package za.co.yourinventory.factories;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.co.yourinventory.domain.Purchases;

/**
 * Created by Rosie on 2016/08/21.
 */
public class PurchasesFactoryTest extends TestCase {

    public void testCreatePurchase() throws Exception {

        Purchases purchases = PurchasesFactory.createPurchase(234.99);
        Assert.assertEquals(234.99, purchases.getTotal());
    }
}