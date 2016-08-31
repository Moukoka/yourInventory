package za.co.yourinventory.services;

import za.co.yourinventory.domain.Goods;

/**
 * Created by Rosie on 2016/08/28.
 */
public interface GoodsService {
    Iterable <Goods> listAllGoods();
    Goods GoodsById (Long id);
    Goods saveGoods(Goods good);
}
