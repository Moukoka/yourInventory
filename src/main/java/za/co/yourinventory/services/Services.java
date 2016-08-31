package za.co.yourinventory.services;

import java.util.List;

/**
 * Created by Rosie on 2016/08/25.
 */
public interface Services <S,ID>  {
    public S findById(ID id);

    public S save(S entity);

    public S update(S entity);

    public void delete(S entity);

    public List<S> findAll();
}
