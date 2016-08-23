package za.co.yourinventory.repositories;

import za.co.yourinventory.domain.Customers;

import java.util.List;

/**
 * Created by Rosie on 2016/08/19.
 */
public interface CustomerRepository extends CrudRepository<Customers, Long> {
    List<Customers> findByLastName(String surname);
}
