package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rosie on 2016/08/12.
 */

@Embeddable
public class Deliveries implements Serializable {
    private Date date;
    private String status;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customers customer;

    public Deliveries() {
    }

    public Deliveries(Builder builder) {
        this.date = builder.date;
        this.customer = builder.customer;
        this.status = builder.status;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public Customers getCustomer() {
        return customer;
    }

    public static class Builder{
        private Date date;
        private String status;
        private Customers customer;

        public Builder theDate(Date value){
            this.date = value;
            return this;
        }
        public Builder status(String value){
            this.status = value;
            return this;
        }
        public Builder customer(Customers value){
            this.customer = value;
            return this;
        }

        public Builder copy(Deliveries value){
            this.date = value.date;
            this.customer = value.customer;
            this.status = value.status;
            return this;
        }

        public Deliveries build(){
            return new Deliveries(this);
        }

    }

    @Override
    public String toString() {
        return "Deliveries{" +
                "date=" + date +
                ", status='" + status + '\'' +
                ", customer=" + customer +
                '}';
    }
}
