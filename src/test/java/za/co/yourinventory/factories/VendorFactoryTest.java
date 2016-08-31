package za.co.yourinventory.factories;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.co.yourinventory.domain.Vendors;

/**
 * Created by Rosie on 2016/08/21.
 */
public class VendorFactoryTest extends TestCase {

    public void testCreateVendor() throws Exception {
        Vendors vendor = VendorFactory.createVendor("comos","sara","scomos@g.com","0112345678");
        Assert.assertEquals("0213456789", vendor.getTelephone());

    }
}