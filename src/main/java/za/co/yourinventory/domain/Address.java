package za.co.yourinventory.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Rosie on 2016/08/12.
 */

@Embeddable
public class Address implements Serializable {
    private String street, city, state;

    @Column(name = "Zip_Code")
    private String zip;

    public Address() {
    }

    public Address(Builder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
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

    public String getState() {
        return state;
    }

    public static class Builder{
        private String street, city, state;
        private String zip;

        public Builder street(String value){
            this.street = value;
            return this;
        }
        public Builder city(String value){
            this.city = value;
            return this;
        }
        public Builder state(String value){
            this.state = value;
            return this;
        }
        public Builder zip(String value){
            this.zip =value;
            return this;
        }

        public Builder copy (Address value){
            this.street = value.street;
            this.city = value.city;
            this.state = value.state;
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
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
