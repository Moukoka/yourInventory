package za.co.yourinventory.services.Impl;

import za.co.yourinventory.domain.Customers;
import za.co.yourinventory.repositories.CustomerRepository;
import za.co.yourinventory.services.CustomerService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Rosie on 2016/08/25.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customers findById(Long aLong) {
        return customerRepository.findOne(aLong);
    }

    public Customers save(Customers customer) {
        return customerRepository.save(customer);
    }

    public Customers update(Customers customer) {
        return customerRepository.save(customer);
    }

    public void delete(Customers customer) {
        customerRepository.delete(customer);

    }

    public List<Customers> findAll() {
        List<Customers> allCustomers = new ArrayList();
        Iterable<Customers> customers = customerRepository.findAll();
        for (Customers customer : customers) {
            allCustomers.add(customer);
        }
        return allCustomers;
    }
}
