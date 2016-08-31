package za.co.yourinventory.services;

import za.co.yourinventory.domain.Sales;

/**
 * Created by Rosie on 2016/08/28.
 */
public interface SalesService {
    Iterable <Sales> listAllSAles();
    Sales getSalesById (Long id);
    Sales saveSale(Sales sale);
}
