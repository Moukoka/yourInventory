package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Address;
import za.co.yourinventory.domain.BankingDetails;
import za.co.yourinventory.domain.Customers;

/**
 * Created by Rosie on 2016/08/19.
 */
public class customerFactory {
    public static Customers createCustomer(String name, String surname, Address value, BankingDetails bnk){
        Customers customer = new Customers.Builder().name(name).surname(surname).ad(value).bank(bnk).build();
        return customer;
    }
}
