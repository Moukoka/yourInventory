package za.co.yourinventory.repositories;

import za.co.yourinventory.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rosie on 2016/08/21.
 */
public interface ProductRepository extends CrudRepository<Product,Long> {
}
