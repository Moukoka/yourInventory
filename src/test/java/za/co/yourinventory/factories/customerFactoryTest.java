package za.co.yourinventory.factories;

import junit.framework.Assert;
import org.junit.Test;
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

        Customers customer = customerFactory.createCustomer("Leila","Lopez");
        Assert.assertEquals("Leila", customer.getName());
    }

    @Test
    public void testUpdateCustomer() throws Exception {

        Customers customer = customerFactory.createCustomer("Leila","Lopez");
        Customers newCus = new Customers.Builder().copy(customer).name("Malaika").build();
        Assert.assertEquals("Malaika", newCus.getName());
        System.out.println("Customer updated");
    }
}