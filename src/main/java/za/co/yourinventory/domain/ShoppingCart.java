package za.co.yourinventory.domain;

import javax.persistence.*;

import java.io.Serializable;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class ShoppingCart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;
    private int quantity;
    private float price;
    private double total;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customers customer;

    public ShoppingCart() {
    }

    public ShoppingCart(Builder builder) {
        this.cartId = builder.cartId;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.total = builder.total;
    }

    public Long getCartId() {
        return cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

    public Customers getCustomer() {
        return customer;
    }

    public static class Builder{
        private Long cartId;
        private int quantity;
        private float price;
        private double total;
        private Customers customer;

        public Builder cart(Long id){
            this.cartId = id;
            return this;
        }
        public Builder qty(int val){
            this.quantity = val;
            return this;
        }
        public Builder price(float value){
            this.price = value;
            return this;
        }
        public Builder total(double val){
            this.total = val;
            return this;
        }
        public Builder cust(Customers val){
            this.customer = val;
            return this;
        }

        public Builder copy(ShoppingCart value){
            this.cartId = value.cartId;
            this.quantity = value.quantity;
            this.price = value.price;
            this.total = value.total;
            this.customer = value.customer;
            return this;
        }

        public ShoppingCart build(){
            return new ShoppingCart(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCart that = (ShoppingCart) o;

        if (!cartId.equals(that.cartId)) return false;
        return customer.equals(that.customer);

    }

    @Override
    public int hashCode() {
        int result = cartId.hashCode();
        result = 31 * result + customer.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                ", customer=" + customer +
                '}';
    }
}
