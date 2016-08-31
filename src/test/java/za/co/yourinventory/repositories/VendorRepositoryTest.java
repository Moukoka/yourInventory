package za.co.yourinventory.repositories;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.co.yourinventory.App;
import za.co.yourinventory.domain.Vendors;
import za.co.yourinventory.factories.VendorFactory;

import static org.junit.Assert.*;

/**
 * Created by Rosie on 2016/08/28.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class VendorRepositoryTest {
    private VendorRepository vendorRepository;

    @Autowired
    public void setVendorRepository(VendorRepository value) {
        this.vendorRepository = value;
    }

    @Test
    public void testSaveProduct(){
        //setup product
        Vendors vendor = VendorFactory.createVendor("Nuts&Us", "Nel", "nutNell@y.fr", "0987654321");

        //save product, verify has ID value after save
        assertNull(vendor.getVendor_id()); //null before save
        vendorRepository.save(vendor);
        assertNotNull(vendor.getVendor_id()); //not null after save

        //fetch from DB
        Vendors fetchedVendor = vendorRepository.findOne(vendor.getVendor_id());

        //should not be null
        assertNotNull(fetchedVendor);

        //should equal
        assertEquals(vendor.getVendor_id(), fetchedVendor.getVendor_id());
        assertEquals(vendor.getContactName(), fetchedVendor.getContactName());

        //update description and save
        fetchedVendor.setEmail("nutNel@y.fr");
        vendorRepository.save(fetchedVendor);

        //get from DB, should be updated
        Vendors fetchedUpdatedVendor = vendorRepository.findOne(fetchedVendor.getVendor_id());
        assertEquals(fetchedVendor.getEmail(), fetchedUpdatedVendor.getEmail());

        //verify count of products in DB
        long vendorCount = vendorRepository.count();
        assertEquals(vendorCount, 1);

        //get all products, list should only have one
        Iterable<Vendors> vendors = vendorRepository.findAll();

        int count = 0;

        for(Vendors p : vendors){
            count++;
        }

        assertEquals(count, 1);
    }

}