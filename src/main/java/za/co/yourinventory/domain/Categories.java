package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class Categories implements Serializable{

    private Long id;
    private String cat_name;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;

    public Categories(Builder builder) {
        this.id = builder.id;
        this.cat_name = builder.cat_name;
        this.description = builder.description;
        this.products = builder.products;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getCat_name() {
        return cat_name;
    }

    public String getDescription() {
        return description;
    }

    public Categories() {
    }

    public  static class Builder{
        private Long id;
        private String cat_name;
        private String description;
        private List<Product> products;

        public Builder id(Long value){
            this.id = value;
            return this;
        }
        public Builder name(String value){
            this.cat_name= value;
            return this;
        }
        public Builder desc (String value){
            this.description = value;
            return this;
        }

        public Builder prod(List<Product> value){
            this.products =  value;
            return this;
        }

        public Builder copy(Categories value){
            this.cat_name = value.cat_name;
            this.description = value.description;
            this.products = value.products;
            return this;
        }

        public Categories build(){
            return new Categories(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categories that = (Categories) o;

        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", cat_name='" + cat_name + '\'' +
                ", description='" + description + '\'' +
                ", products=" + products +
                '}';
    }
}
