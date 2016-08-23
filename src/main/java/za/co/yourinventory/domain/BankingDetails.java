package za.co.yourinventory.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rosie on 2016/08/12.
 */
@Embeddable
public class BankingDetails implements Serializable {
    private String bankName;
    private String cardNumber;
    private Date expiryDate;
    private int securityCode;

    public BankingDetails() {
    }

    public BankingDetails(Builder builder) {
        this.bankName = builder.bankName;
        this.cardNumber = builder.cardNumber;
        this.expiryDate = builder.expiryDate;
        this.securityCode = builder.securityCode;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public static class Builder{
        private String bankName;
        private String cardNumber;
        private Date expiryDate;
        private int securityCode;

        public Builder name(String value){
            this.bankName = value;
            return this;
        }
        public Builder card(String value){
            this.cardNumber = value;
            return this;
        }
        public Builder exDate(Date value){
            this.expiryDate = value;
            return this;
        }
        public Builder code(int value){
            this.securityCode = value;
            return this;
        }

        public Builder copy(BankingDetails value){
            this.bankName = value.bankName;
            this.cardNumber = value.cardNumber;
            this.expiryDate = value.expiryDate;
            this.securityCode = value.securityCode;
            return this;
        }

        public BankingDetails build(){
            return new BankingDetails(this);
        }
    }

    @Override
    public String toString() {
        return "BankingDetails{" +
                "bankName='" + bankName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expiryDate=" + expiryDate +
                ", securityCode=" + securityCode +
                '}';
    }
}
