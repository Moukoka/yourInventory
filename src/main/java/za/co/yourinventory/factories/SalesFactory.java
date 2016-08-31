package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Goods;
import za.co.yourinventory.domain.Sales;
import za.co.yourinventory.domain.Vendors;

import java.util.Date;
import java.util.List;

/**
 * Created by Rosie on 2016/08/21.
 */
public class SalesFactory {
    public static Sales createSales(Vendors ven,List<Goods> goods,int num,float tot, Date date){
        Sales sale = new Sales.Builder().vendor(ven).goods(goods).qty(num).total(tot).date(new Date()).build();
        return sale;
    }
}
