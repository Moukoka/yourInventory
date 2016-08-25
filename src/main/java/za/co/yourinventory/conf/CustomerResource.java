package za.co.yourinventory.conf;

import org.springframework.hateoas.ResourceSupport;
import za.co.yourinventory.domain.Address;
import za.co.yourinventory.domain.BankingDetails;
import za.co.yourinventory.domain.Purchases;

import javax.persistence.*;

/**
 * Created by Rosie on 2016/08/25.
 */
public class CustomerResource extends ResourceSupport {

    private Long res_id;
    private Address address;
    private String name, surname;
    private BankingDetails bankingDetails;

    public CustomerResource() {
    }

    public CustomerResource(Builder builder) {
        this.res_id = builder.res_id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.bankingDetails = builder.bankingDetails;
        this.address = builder.address;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public BankingDetails getBankingDetails() {
        return bankingDetails;
    }

    public Long getCustomer_id() {
        return res_id;
    }
    public Address getAddress() {
        return address;
    }

    public static class Builder{
        private Long res_id;
        private Purchases purchase;
        private String name, surname;
        private BankingDetails bankingDetails;
        private Address address;


        public Builder id(Long value){
            this.res_id = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder bank(BankingDetails value){
            this.bankingDetails = value;
            return this;
        }

        public Builder ad(Address value){
            this.address = value;
            return this;
        }

        public Builder copy(CustomerResource value){
            this.res_id = value.res_id;
            this.name = value.name;
            this.surname = value.surname;
            this.bankingDetails = value.bankingDetails;
            this.address = value.address;

            return this;
        }

        public CustomerResource build(){return new CustomerResource(this);}
    }


}
