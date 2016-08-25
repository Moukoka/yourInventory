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
    private int quantity;
    private boolean delivery;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long purchase_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customers customer;

    @OneToOne(mappedBy = "deliveries")
    private Deliveries deliver;

    public Purchases() {
    }

    public Purchases(Builder builder) {
        this.purchase_id = builder.purchase_id;
        this.date = builder.date;
        this.total = builder.total;
        this.customer = builder.customer;
        this.delivery = builder.delivery;
        this.quantity = builder.quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public Long getPurchase_id() {
        return purchase_id;
    }

    public Deliveries getDeliver() {
        return deliver;
    }

    public Date getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    public Customers getCustomer() {
        return customer;
    }

    public static class Builder{
        private Long purchase_id;
        private Date date;
        private double total;
        private Customers customer;
        private int quantity;
        private boolean delivery;
        private Deliveries deliver;

        public Builder id(Long value){
            this.purchase_id = value;
            return this;
        }
        public Builder dte(Date value){
            this.date = value;
            return this;
        }
        public Builder qty(int value){
            this.quantity = value;
            return this;
        }
        public Builder del(boolean value){
            this.delivery = value;
            return this;
        }
        public Builder tot(double value){
            this.total = value;
            return this;
        }

        public Builder customer(Customers value){
            this.customer =value;
            return this;
        }

        public Builder copy(Purchases value){
            this.purchase_id = value.purchase_id;
            this.date = value.date;
            this.total = value.total;
            this.quantity = value.quantity;
            this.delivery = value.delivery;
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

        return purchase_id.equals(purchases.purchase_id);

    }

    @Override
    public int hashCode() {
        return purchase_id.hashCode();
    }

    @Override
    public String toString() {
        return "Purchases{" +
                "date=" + date +
                ", total=" + total +
                ", quantity=" + quantity +
                ", delivery=" + delivery +
                ", purchase_id=" + purchase_id +
                ", customer=" + customer +
                '}';
    }
}
