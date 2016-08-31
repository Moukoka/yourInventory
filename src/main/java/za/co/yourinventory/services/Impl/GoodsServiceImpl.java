package za.co.yourinventory.services.Impl;

import za.co.yourinventory.domain.Goods;
import za.co.yourinventory.repositories.GoodsRepository;
import za.co.yourinventory.services.GoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rosie on 2016/08/28.
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    GoodsRepository goodsRepository;

    @Autowired
    public void setGoodsRepository(GoodsRepository value) {
        this.goodsRepository = value;
    }

    @Override
    public Iterable<Goods> listAllGoods() {
        return goodsRepository.findAll();
    }

    @Override
    public Goods GoodsById(Long id) {
        return goodsRepository.findOne(id);
    }

    @Override
    public Goods saveGoods(Goods good) {
        return goodsRepository.save(good);
    }
}
