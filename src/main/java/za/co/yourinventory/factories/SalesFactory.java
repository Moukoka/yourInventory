package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Sales;

/**
 * Created by Rosie on 2016/08/21.
 */
public class SalesFactory {
    public static Sales createSales(int num){
        Sales sale = new Sales.Builder().qty(num).build();
        return sale;
    }
}
