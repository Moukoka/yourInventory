package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class Purchases implements Serializable {
    private Date date;
    private double total;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long purchaseId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId")
    private Customers customer;

    public Purchases() {
    }

    public Purchases(Builder builder) {
        this.purchaseId = builder.purchaseId;
        this.date = builder.date;
        this.total = builder.total;
        this.product = builder.product;
        this.customer = builder.customer;
    }

    public Date getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    public Product getProduct() {
        return product;
    }

    public Customers getCustomer() {
        return customer;
    }

    public static class Builder{
        private Long purchaseId;
        private Date date;
        private double total;
        private Product product;
        private Customers customer;

        public Builder id(Long value){
            this.purchaseId = value;
            return this;
        }
        public Builder dte(Date value){
            this.date = value;
            return this;
        }
        public Builder tot(double value){
            this.total = value;
            return this;
        }
        public Builder prod(Product value){
            this.product = value;
            return this;
        }
        public Builder customer(Customers value){
            this.customer =value;
            return this;
        }

        public Builder copy(Purchases value){
            this.purchaseId = value.purchaseId;
            this.date = value.date;
            this.total = value.total;
            this.product = value.product;
            this.customer = value.customer;
            return this;
        }

        public Purchases build(){return new Purchases(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchases purchases = (Purchases) o;

        return purchaseId.equals(purchases.purchaseId);

    }

    @Override
    public int hashCode() {
        return purchaseId.hashCode();
    }

    @Override
    public String toString() {
        return "Purchases{" +
                "date=" + date +
                ", total=" + total +
                ", purchaseId=" + purchaseId +
                ", product=" + product +
                ", customer=" + customer +
                '}';
    }
}
