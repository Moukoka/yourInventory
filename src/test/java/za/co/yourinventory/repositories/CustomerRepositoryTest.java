package za.co.yourinventory.repositories;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.junit.Test;
import org.junit.Assert;
import za.co.yourinventory.App;
import za.co.yourinventory.domain.Address;
import za.co.yourinventory.domain.BankingDetails;
import za.co.yourinventory.domain.Customers;
import za.co.yourinventory.factories.AddressFactory;
import za.co.yourinventory.factories.BankingDetailsFactory;
import za.co.yourinventory.factories.customerFactory;

/**
 * Created by Rosie on 2016/08/25.
 */
//@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
//@SpringBootApplication
public class CustomerRepositoryTest extends AbstractTestNGSpringContextTests {

    private Long customer_id;
    private Long address_id;
    private Long bank_id;

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void create() throws Exception {

        Address address = AddressFactory.createAddress(3,"main","goodwood","Cape Town","1234");
        BankingDetails bankingDetails = BankingDetailsFactory.createDetails("fnb","123456",234);
       Customers customer = new Customers.Builder().name("Rosie").surname("Moukoka").ad(address).bank(bankingDetails).build();

        customerRepository.save(customer);

        customer_id = customer.getCustomer_id();
        address_id = address.getAddress_id();
        bank_id = bankingDetails.getBank_id();
        Assert.assertNotNull(customer.getCustomer_id());
        //Assert.assertEquals(customer_id.);

    }

    /*@Test
    public void read() throws Exception {
        Customers customers = customerRepository.findOne(customer_id);
        Assert.assertEquals("Rosie", customers.getName());
    }*/

}