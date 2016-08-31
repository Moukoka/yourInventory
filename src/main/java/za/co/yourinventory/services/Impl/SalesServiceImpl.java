package za.co.yourinventory.services.Impl;

import za.co.yourinventory.domain.Sales;
import za.co.yourinventory.repositories.SalesRepository;
import za.co.yourinventory.services.SalesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rosie on 2016/08/28.
 */
@Service
public class SalesServiceImpl implements SalesService {

    private SalesRepository salesRepository;

    @Autowired
    public void setSalesRepository(SalesRepository value) {
        this.salesRepository = value;
    }

    @Override
    public Iterable<Sales> listAllSAles() {
        return salesRepository.findAll();
    }

    @Override
    public Sales getSalesById(Long id) {
        return salesRepository.findOne(id);
    }

    @Override
    public Sales saveSale(Sales sale) {
        return salesRepository.save(sale);
    }
}
