package backend.agricolas.dto;

import backend.agricolas.model.Farm;
import backend.agricolas.model.ShoppingCart;
import lombok.Data;

import java.util.Date;

@Data
public class ShoppingCartDto {
    private Date date;
    private double total_price;
    private Long farm_id;
    private Long person_cc;

    public ShoppingCart getShoppingCart(ShoppingCartDto shoppingCartDto){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setDate(shoppingCartDto.getDate());
        shoppingCart.setTotal_price(shoppingCartDto.getTotal_price());
        return shoppingCart;
    }
}
