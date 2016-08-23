package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Address;
import za.co.yourinventory.domain.Customers;

/**
 * Created by Rosie on 2016/08/19.
 */
public class customerFactory {
    public static Customers createCustomer(String name, String surname){
        Customers customer = new Customers.Builder().name(name).surname(surname).build();
        return customer;
    }
}
