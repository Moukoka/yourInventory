package za.co.yourinventory.repositories;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.co.yourinventory.App;
import za.co.yourinventory.domain.Goods;
import za.co.yourinventory.domain.Sales;
import za.co.yourinventory.domain.Vendors;
import za.co.yourinventory.factories.GoodsFactory;
import za.co.yourinventory.factories.SalesFactory;
import za.co.yourinventory.factories.VendorFactory;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Rosie on 2016/08/28.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class SalesRepositoryTest {

    private SalesRepository salesRepository;
    private List<Goods> goodList;
    @Autowired
    public void setSalesRepository(SalesRepository value) {
        this.salesRepository= value;
    }

    @Test
    public void testSaveProduct(){
        //setup sale
       Vendors vendors = VendorFactory.createVendor("Kellog","Lil","Kl@g.fr","021234567");
        Goods good =GoodsFactory.createGoods("sugar","blocks",2);
        goodList.add(good);

        Sales sale = SalesFactory.createSales(vendors,goodList,2,300,new Date());
        //save product, verify has ID value after save
        assertNull(sale.getId()); //null before save
        salesRepository.save(sale);
        assertNotNull(sale.getId()); //not null after save

        //fetch from DB
        Sales fetchedSale = salesRepository.findOne(sale.getId());

        //should not be null
        assertNotNull(fetchedSale);

        //should equal
        assertEquals(sale.getId(), fetchedSale.getId());
        assertEquals(sale.getVendor(), fetchedSale.getVendor());

        //update description and save
        fetchedSale.setQuantity(5);
        salesRepository.save(fetchedSale);

        //get from DB, should be updated
        Sales fetchedUpdatedSale = salesRepository.findOne(fetchedSale.getId());
        assertEquals(fetchedSale.getQuantity(), fetchedUpdatedSale.getQuantity());

        //verify count of products in DB
        long productCount = salesRepository.count();
        assertEquals(productCount, 1);

        //get all products, list should only have one
        Iterable<Sales> sales = salesRepository.findAll();

        int count = 0;

        for(Sales p : sales){
            count++;
        }

        assertEquals(count, 1);
    }

}