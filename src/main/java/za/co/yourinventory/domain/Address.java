package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class Address implements Serializable {

    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long address_id;
    private int streetNumber;
    private String street, city, suburb;

    @Column(name = "Zip_Code")
    private String zip;

    @OneToOne(mappedBy = "address")
    private Customers customer;

    public Address() {
    }

    public Address(Builder builder) {
        this.address_id = builder.address_id;
        this.streetNumber = builder.streetNumber;
        this.suburb = builder.suburb;
        this.street = builder.street;
        this.city = builder.city;
        this.zip = builder.zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public Customers getCustomer() {
        return customer;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getSuburb() {
        return suburb;
    }

    public static class Builder{
        private Long address_id;
        private int streetNumber;
        private String street, city, suburb;
        private String zip;

        public Builder id(Long value){
            this.address_id= value;
            return this;
        }
        public Builder num(int value){
            this.streetNumber = value;
            return this;
        }
        public Builder street(String value){
            this.street = value;
            return this;
        }
        public Builder city(String value){
            this.city = value;
            return this;
        }
        public Builder suburb(String value){
            this.suburb = value;
            return this;
        }
        public Builder zip(String value){
            this.zip =value;
            return this;
        }

        public Builder copy (Address value){
            this.address_id= value.address_id;
            this.streetNumber = value.streetNumber;
            this.street = value.street;
            this.city = value.city;
            this.suburb = value.suburb;
            this.zip = value.zip;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", streetNumber=" + streetNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", suburb='" + suburb + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
