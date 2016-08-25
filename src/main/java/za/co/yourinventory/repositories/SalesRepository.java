package za.co.yourinventory.repositories;

import za.co.yourinventory.domain.Sales;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rosie on 2016/08/21.
 */
public interface SalesRepository extends CrudRepository<Sales,Long> {
}
