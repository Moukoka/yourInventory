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
    private Long customerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId")
    private Purchases purchase;

    private String name, surname;
    private int age;

    @Embedded
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "cardNumber")
    private BankingDetails bankingDetails;

    @Embedded
    @ManyToOne(cascade = CascadeType.ALL)
    private List<Deliveries> delivery;

    @Embedded
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Customers() {
    }

    public Customers(Builder builder) {
        this.customerId = builder.customerId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.bankingDetails = builder.bankingDetails;
        this.delivery = builder.delivery;
        this.address = builder.address;

    }

    public Long getCustomerId() {
        return customerId;
    }

    public Purchases getPurchase() {
        return purchase;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public BankingDetails getBankingDetails() {
        return bankingDetails;
    }

    public List<Deliveries> getDelivery() {
        return delivery;
    }

    public static class Builder{
        private Long customerId;
        private Purchases purchase;
        private String name, surname;
        private int age;
        private BankingDetails bankingDetails;
        private List<Deliveries> delivery;
        private Address address;


        public Builder id(Long value){
            this.customerId = value;
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
        public Builder age(int num){
            this.age = num;
            return this;
        }
        public Builder bank(BankingDetails value){
            this.bankingDetails = value;
            return this;
        }
        public Builder deliver(List<Deliveries> value){
            this.delivery = value;
            return this;
        }
        public Builder ad(Address value){
            this.address = value;
            return this;
        }

        public Builder copy(Customers value){
            this.customerId = value.customerId;
            this.name = value.name;
            this.surname = value.surname;
            this.age = value.age;
            this.bankingDetails = value.bankingDetails;
            this.delivery= value.delivery;
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

        return customerId.equals(customers.customerId);

    }

    @Override
    public int hashCode() {
        return customerId.hashCode();
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerId=" + customerId +
                ", purchase=" + purchase +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", bankingDetails=" + bankingDetails +
                ", delivery=" + delivery +
                '}';
    }
}
