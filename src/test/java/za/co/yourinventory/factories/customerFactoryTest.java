package za.co.yourinventory.factories;

import junit.framework.Assert;
import org.junit.Test;
import za.co.yourinventory.domain.Address;
import za.co.yourinventory.domain.BankingDetails;
import za.co.yourinventory.domain.Customers;

//import static org.testng.Assert.*;

/**
 * Created by Rosie on 2016/08/19.
 */
public class customerFactoryTest {

    /*@org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {

    }*/

    @Test
    public void testCreateCustomer() throws Exception {
        Address address = AddressFactory.createAddress(3,"kolt","wood","Cape Town","1234");
        BankingDetails bankingDetails = BankingDetailsFactory.createDetails("absa","13456",24);

        Customers customer = customerFactory.createCustomer("Leila","Lopez",address,bankingDetails);
        Assert.assertEquals("Leila", customer.getName());
    }

    @Test
    public void testUpdateCustomer() throws Exception {

        Address address = AddressFactory.createAddress(3,"kolt","wood","Cape Town","1234");
        BankingDetails bankingDetails = BankingDetailsFactory.createDetails("absa","13456",24);

        Customers customer = customerFactory.createCustomer("Leila","Lopez",address,bankingDetails);

        Customers newCus = new Customers.Builder().copy(customer).name("Malaika").build();
        Assert.assertEquals("Malaika", newCus.getName());
        System.out.println("Customer updated");
    }
}