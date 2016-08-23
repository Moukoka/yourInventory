package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Goods;

/**
 * Created by Rosie on 2016/08/21.
 */
public class GoodsFactory {
    public static Goods createGoods(String name){
        Goods good = new Goods.Builder().name(name).build();
        return good;
    }
}
