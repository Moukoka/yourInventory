package za.co.yourinventory.services;

import za.co.yourinventory.domain.Vendors;

/**
 * Created by Rosie on 2016/08/28.
 */
public interface VendorsService {
    Iterable <Vendors> listAllVendors();
    Vendors getVendorsById (Long id);
    Vendors saveVendors(Vendors vendor);
}
