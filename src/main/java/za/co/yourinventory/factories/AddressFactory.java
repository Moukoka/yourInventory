package za.co.yourinventory.factories;

import za.co.yourinventory.domain.Address;

/**
 * Created by Rosie on 2016/08/25.
 */
public class AddressFactory  {
    public static Address createAddress(int num, String name, String sub,String city,String code){
        Address address = new Address.Builder().num(num).street(name).suburb(sub).city(city).zip(code).build();
        return address;
    }
}
