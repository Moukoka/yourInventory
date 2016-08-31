package za.co.yourinventory.repositories;

import org.springframework.stereotype.Repository;
import za.co.yourinventory.domain.Customers;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rosie on 2016/08/19.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customers, Long> {
}
