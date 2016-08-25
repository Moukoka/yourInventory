package za.co.yourinventory.repositories;

import za.co.yourinventory.domain.Goods;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rosie on 2016/08/21.
 */
public interface GoodsRepository extends CrudRepository<Goods,Long>{
}
