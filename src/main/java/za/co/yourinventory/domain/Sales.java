package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class Sales implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendor_id")
    private Vendors vendor;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "goodId")
    private List<Goods> goodsList;

    private int quantity;
    private float total;
    private Date date;

    public Sales() {
    }

    public Sales(Builder builder) {
        this.id = builder.id;
        this.vendor = builder.vendor;
        this.goodsList = builder.goodsList;
        this.quantity = builder.quantity;
        this.total = builder.total;
        this.date = builder.date;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public float getTotal() {
        return total;
    }

    public int getQuantity() {
        return quantity;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public Vendors getVendor() {
        return vendor;
    }

    public static class Builder{
        private Long id;
        private Vendors vendor;
        private List<Goods> goodsList;
        private int quantity;
        private float total;
        private Date date;

        public Builder id(Long id){
            this.id = id;
            return this;
        }
        public Builder vendor(Vendors value){
            this.vendor = value;
            return this;
        }
        public Builder goods(List<Goods> value){
            this.goodsList = value;
            return this;
        }
        public Builder qty(int value){
            this.quantity = value;
            return this;
        }
        public Builder total(float value){
            this.total = value;
            return this;
        }
        public Builder date(Date date){
            this.date = date;
            return this;
        }

        public Builder copy(Sales value){
            this.id = value.id;
            this.vendor = value.vendor;
            this.goodsList = value.goodsList;
            this.quantity = value.quantity;
            this.total = value.total;
            this.date = value.date;
            return this;
        }

        public Sales build(){
            return new Sales(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sales sales = (Sales) o;

        if (!id.equals(sales.id)) return false;
        return vendor.equals(sales.vendor);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + vendor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", vendor=" + vendor +
                ", goodsList=" + goodsList +
                ", quantity=" + quantity +
                ", total=" + total +
                ", date=" + date +
                '}';
    }
}
