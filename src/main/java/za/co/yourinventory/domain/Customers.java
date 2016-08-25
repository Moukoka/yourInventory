package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class Customers implements Serializable {
   @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long customer_id;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "address_id")
private Address address;

private String name, surname;

@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JoinColumn(name = "cardNumber")
private BankingDetails bankingDetails;



    public Customers() {
    }

    public Customers(Builder builder) {
        this.customer_id = builder.customer_id;
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
        return customer_id;
    }
    public Address getAddress() {
        return address;
    }

public static class Builder{
    private Long customer_id;
    private Purchases purchase;
    private String name, surname;
    private BankingDetails bankingDetails;
    private Address address;


    public Builder id(Long value){
        this.customer_id = value;
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

    public Builder copy(Customers value){
        this.customer_id = value.customer_id;
        this.name = value.name;
        this.surname = value.surname;
        this.bankingDetails = value.bankingDetails;
        this.address = value.address;

        return this;
    }

    public Customers build(){return new Customers(this);}
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        return customer_id.equals(customers.customer_id);

    }

    @Override
    public int hashCode() {
        return customer_id.hashCode();
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customer_id=" + customer_id +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bankingDetails=" + bankingDetails +
                '}';
    }
}
