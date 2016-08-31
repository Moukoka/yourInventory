package za.co.yourinventory.services.Impl;

import za.co.yourinventory.domain.Vendors;
import za.co.yourinventory.repositories.VendorRepository;
import za.co.yourinventory.services.VendorsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rosie on 2016/08/28.
 */

@Service
public class VendorsServiceImpl implements VendorsService {

    private VendorRepository vendorRepository;

    @Autowired
    public void setVendorRepository(VendorRepository value) {
        this.vendorRepository = value;
    }
    @Override
    public Iterable<Vendors> listAllVendors() {
        return  vendorRepository.findAll();
    }

    @Override
    public Vendors getVendorsById(Long id) {
        return vendorRepository.findOne(id);
    }

    @Override
    public Vendors saveVendors(Vendors vendor) {
        return vendorRepository.save(vendor);
    }
}
