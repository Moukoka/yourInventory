package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Vendors;

/**
 * Created by Rosie on 2016/08/21.
 */
public class VendorFactory {
    public static Vendors createVendor(String tel){
        Vendors vendor = new Vendors.Builder().tel(tel).build();
        return vendor;
    }
}
