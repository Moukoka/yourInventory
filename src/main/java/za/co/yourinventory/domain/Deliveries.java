package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rosie on 2016/08/12.
 */

@Entity
public class Deliveries implements Serializable {
    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
            private Long delivery_id;
    private Date date;
    private String status;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase_id")
    private Purchases purchase;

    public Deliveries() {
    }

    public Deliveries(Builder builder) {
        this.delivery_id = builder.delivery_id;
        this.date = builder.date;
        this.status = builder.status;
        this.purchase = builder.purchase;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public Long getDelivery_id() {
        return delivery_id;
    }

    public Purchases getPurchase() {
        return purchase;
    }

    public static class Builder{
        private Long delivery_id;
        private Date date;
        private String status;
        private Purchases purchase;

        public Builder id(Long value){
            this.delivery_id = value;
            return this;
        }
        public Builder purchase(Purchases value){
            this.purchase = value;
            return this;
        }
        public Builder theDate(Date value){
            this.date = value;
            return this;
        }
        public Builder status(String value){
            this.status = value;
            return this;
        }


        public Builder copy(Deliveries value){
            this.delivery_id= value.delivery_id;
            this.date = value.date;
            this.status = value.status;
            this.purchase = value.purchase;
            return this;
        }

        public Deliveries build(){
            return new Deliveries(this);
        }

    }

    @Override
    public String toString() {
        return "Deliveries{" +
                "delivery_id=" + delivery_id +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", purchase=" + purchase +
                '}';
    }
}
