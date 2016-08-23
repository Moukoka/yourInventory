package za.co.yourinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.yourinventory.domain.Sales;

/**
 * Created by Rosie on 2016/08/21.
 */
public interface SalesRepository extends JpaRepository<Sales,Long> {
}
