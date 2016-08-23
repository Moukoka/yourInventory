package za.co.yourinventory.repositories;

import java.util.Set;

/**
 * Created by Rosie on 2016/08/21.
 */
public interface CrudRepository<E, ID> {
     E findById(ID id);
     E save (E entity);
     E update(E entity);
    public void delete (E entity);
    public Set<E> findAll();
}
