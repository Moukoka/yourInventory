package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Purchases;

/**
 * Created by Rosie on 2016/08/21.
 */
public class PurchasesFactory {
    public static Purchases createPurchase(double tot){
        Purchases purchases = new Purchases.Builder().tot(tot).build();
        return purchases;
    }
}
