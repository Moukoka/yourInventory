package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Goods;
import za.co.yourinventory.domain.Sales;

/**
 * Created by Rosie on 2016/08/21.
 */
public class GoodsFactory {
    public static Goods createGoods(String name, String desc, float price){
        Goods good = new Goods.Builder().name(name).desc(desc).price(price).build();
        return good;
    }
}
