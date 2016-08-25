package za.co.yourinventory.repositories;

import za.co.yourinventory.domain.Vendors;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rosie on 2016/08/21.
 */
public interface VendorRepository extends CrudRepository<Vendors,Long> {
}
