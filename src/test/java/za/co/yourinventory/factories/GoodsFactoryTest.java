package za.co.yourinventory.factories;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.co.yourinventory.domain.Goods;

/**
 * Created by Rosie on 2016/08/21.
 */
public class GoodsFactoryTest extends TestCase {

    public void testCreateGoods() throws Exception {

        Goods good = GoodsFactory.createGoods("Nescafe","Coffee",2);
        Assert.assertEquals("Nescafe", good.getName());
    }
}