package za.co.yourinventory.repositories;

import za.co.yourinventory.domain.Purchases;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rosie on 2016/08/21.
 */
public interface PurchasesRepository extends CrudRepository<Purchases,Long> {
}
