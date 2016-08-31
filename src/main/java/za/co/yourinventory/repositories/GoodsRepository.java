package za.co.yourinventory.repositories;

import org.springframework.stereotype.Repository;
import za.co.yourinventory.domain.Goods;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rosie on 2016/08/21.
 */
@Repository
public interface GoodsRepository extends CrudRepository<Goods,Long>{
}
