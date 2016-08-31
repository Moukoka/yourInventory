package za.co.yourinventory.domain;

import javax.persistence.*;
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
    private float unit_price;


    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sales sale;

    public Goods() {
    }

    public Goods(Builder builder) {
        this.goodId = builder.goodId;
        this.name = builder.name;
        this.description = builder.description;
        this.unit_price = builder.unit_price;
        this.sale = builder.sale;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public Sales getSale() {
        return sale;
    }

    public Long getGoodId() {
        return goodId;
    }

    public float getPrice() {
        return unit_price;
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
        private float unit_price;
        private Sales sale;

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
            this.unit_price = value;
            return this;
        }
        public Builder sale(Sales value){
            this.sale = value;
            return this;
        }

        public Builder copy(Goods value){
            this.goodId = value.goodId;
            this.name = value.name;
            this.description = value.description;
            this.unit_price = value.unit_price;
            this.sale = value.sale;
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
                ", unit_price=" + unit_price +
                ", sale=" + sale +
                '}';
    }
}
