package za.co.yourinventory.repositories;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.co.yourinventory.App;
import za.co.yourinventory.domain.Goods;
import za.co.yourinventory.factories.GoodsFactory;

import static org.junit.Assert.*;

/**
 * Created by Rosie on 2016/08/28.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class GoodsRepositoryTest {

    private GoodsRepository goodsRepository;

    @Autowired
    public void setGoodsRepository(GoodsRepository value) {
        this.goodsRepository = value;
    }

    @Test
    public void testSaveProduct(){
        //setup product
      Goods good = GoodsFactory.createGoods("anItem","yellow",3);

        //save product, verify has ID value after save
        assertNull(good.getGoodId()); //null before save
        goodsRepository.save(good);
        assertNotNull(good.getGoodId()); //not null after save

        //fetch from DB
        Goods fetchedProduct = goodsRepository.findOne(good.getGoodId());

        //should not be null
        assertNotNull(fetchedProduct);

        //should equal
        assertEquals(good.getGoodId(), fetchedProduct.getGoodId());
        assertEquals(good.getDescription(), fetchedProduct.getDescription());

        //update description and save
        fetchedProduct.setUnit_price(2);
        goodsRepository.save(fetchedProduct);

        //get from DB, should be updated
        Goods fetchedUpdatedProduct = goodsRepository.findOne(fetchedProduct.getGoodId());
        assertEquals(fetchedProduct.getPrice(), fetchedUpdatedProduct.getPrice());

        //verify count of products in DB
        long productCount = goodsRepository.count();
        assertEquals(productCount, 1);

        //get all products, list should only have one
        Iterable<Goods> products = goodsRepository.findAll();

        int count = 0;

        for(Goods p : products){
            count++;
        }

        assertEquals(count, 1);
    }

}