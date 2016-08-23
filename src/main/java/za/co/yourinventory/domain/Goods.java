package za.co.yourinventory.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Rosie on 2016/08/12.
 */
@Entity
public class Goods implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long goodId;

    private String name, description;
    private float price;
    private int quantity;

    public Goods() {
    }

    public Goods(Builder builder) {
        this.goodId = builder.goodId;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    public Long getGoodId() {
        return goodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public static class Builder{
        private Long goodId;
        private String name, description;
        private float price;
        private int quantity;

        public Builder id(Long id){
            this.goodId = id;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder desc(String value){
            this.description = value;
            return this;
        }
        public Builder price(float value){
            this.price = value;
            return this;
        }
        public Builder quant(int num){
            this.quantity = num;
            return this;
        }

        public Builder copy(Goods value){
            this.goodId = value.goodId;
            this.name = value.name;
            this.description = value.description;
            this.price = value.price;
            this.quantity = value.quantity;
            return this;
        }

        public Goods build(){
            return new Goods(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        return goodId.equals(goods.goodId);

    }

    @Override
    public int hashCode() {
        return goodId.hashCode();
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodId=" + goodId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
