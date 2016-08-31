package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Vendors;

/**
 * Created by Rosie on 2016/08/21.
 */
public class VendorFactory {
    public static Vendors createVendor(String comp, String name, String mail,String tel){
        Vendors vendor = new Vendors.Builder().company(comp).name(name).email(mail).tel(tel).build();
        return vendor;
    }
}
