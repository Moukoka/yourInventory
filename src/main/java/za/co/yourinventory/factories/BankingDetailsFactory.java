package za.co.yourinventory.factories;

import za.co.yourinventory.domain.BankingDetails;

import java.util.Date;

/**
 * Created by Rosie on 2016/08/25.
 */
public class BankingDetailsFactory {
    public static BankingDetails createDetails(String name,String card,int code){
        BankingDetails bankingDetails = new BankingDetails.Builder()
                .name(name).card(card).code(code).build();
        return bankingDetails;
    }
}
