package za.co.yourinventory.factories;

import za.co.yourinventory.domain.ShoppingCart;

/**
 * Created by Rosie on 2016/08/19.
 */
public class ShoppingCartFactory {
    public static ShoppingCart createShopping(int qty){
        ShoppingCart cart = new ShoppingCart.Builder().qty(qty).build();
        return cart;
    }
}
