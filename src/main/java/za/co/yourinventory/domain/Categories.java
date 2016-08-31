package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class Categories implements Serializable{

    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
        private Long category_id;
    private String category_name;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private List<Product> products;

    public Categories(Builder builder) {
        this.category_id = builder.category_id;
        this.category_name = builder.category_name;
        this.products = builder.products;
    }


    public Long getId() {
        return category_id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getCat_name() {
        return category_name;
    }

    public Categories() {
    }

    public  static class Builder{
        private Long category_id;
        private String category_name;
        private List<Product> products;

        public Builder id(Long value){
            this.category_id = value;
            return this;
        }
        public Builder name(String value){
            this.category_name= value;
            return this;
        }

        public Builder prod(List<Product> value){
            this.products =  value;
            return this;
        }

        public Builder copy(Categories value){
            this.category_id = value.category_id;
            this.category_name = value.category_name;
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

        return category_id.equals(that.category_id);

    }

    @Override
    public int hashCode() {
        return category_id.hashCode();
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + category_id +
                ", cat_name='" + category_name + '\'' +

                '}';
    }
}
