package za.co.yourinventory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Rosie on 2016/08/12.
 */
@Entity
public class Vendors implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vendor_id;
    private String companyName, contactName, email;
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name = "vendor_id")
        private List sales;

    public Vendors() {
    }

    public Vendors(Builder builder) {
        this.vendor_id = builder.vendor_id;
        this.companyName = builder.companyName;
        this.contactName = builder.contactName;
        this.email = builder.email;
        this.telephone = builder.telephone;
        this.sales = builder.sales;
    }

    public Long getVendor_id() {
        return vendor_id;
    }

    public List<Sales> getSales() {
        return sales;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getContactName() {
        return contactName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static class Builder{

        private Long vendor_id;
        private String companyName, contactName, email;
        private String telephone;
        private List<Sales> sales;

        public Builder id(Long value){
            this.vendor_id = value;
            return this;
        }
        public Builder company(String value){
            this.companyName = value;
            return this;
        }
        public Builder name(String value){
            this.contactName = value;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder tel(String tel){
            this.telephone = tel;
            return this;
        }
        public Builder sale(List<Sales> value){
            this.sales = value;
            return this;
        }

        public Builder copy(Vendors value){
            this.vendor_id= value.vendor_id;
            this.companyName = value.companyName;
            this.contactName = value.contactName;
            this.email = value.email;
            this.telephone = value.telephone;
            this.sales = value.sales;
            return this;
        }

        public Vendors build(){
            return new Vendors(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vendors vendors = (Vendors) o;

        return vendor_id.equals(vendors.vendor_id);

    }

    @Override
    public int hashCode() {
        return vendor_id.hashCode();
    }

    @Override
    public String toString() {
        return "Vendors{" +
                "vendor_id=" + vendor_id +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", sales=" + sales +
                '}';
    }
}
