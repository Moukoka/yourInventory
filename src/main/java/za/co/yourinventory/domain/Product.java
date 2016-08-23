package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class Product implements Serializable{
    @Id
    private Long product_id;
    private String name, description;
    private float price;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cat_name")
    private Categories category;

    public Product() {
    }

    public Product(Builder builder) {
        this.product_id = builder.product_id;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.category = builder.category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getProduct_id() {
        return product_id;
    }

    public Categories getCategory() {
        return category;
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

        private Long product_id;
        private String name, description;
        private float price;
        private Categories category;

        public Builder prodId(Long id){
            this.product_id = id;
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
        public Builder price(float num){
            this.price = num;
            return this;
        }
        public Builder cat(Categories cat){
            this.category = cat;
            return this;
        }
        public Builder copy(Product value){
            this.product_id= value.product_id;
            this.name = value.name;
            this.description = value.description;
            this.price = value.price;
            this.category= value.category;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!product_id.equals(product.product_id)) return false;
        return category.equals(product.category);

    }

    @Override
    public int hashCode() {
        int result = product_id.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Product id=" + product_id +
                ", Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", Price=" + price +
                ", Category=" + category +
                '}';
    }
}
