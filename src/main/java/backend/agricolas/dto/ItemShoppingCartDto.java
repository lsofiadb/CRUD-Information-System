package backend.agricolas.dto;

import backend.agricolas.model.ItemShoppingCart;
import lombok.Data;

@Data
public class ItemShoppingCartDto {
    private Long quantity;
    private double subtotal_price;
    private Long shopping_cart_id;
    private Long inventory_id;

    public ItemShoppingCart getItemShoppingCart(ItemShoppingCartDto itemShoppingCartDto){
        ItemShoppingCart itemShoppingCart = new ItemShoppingCart();
        itemShoppingCart.setQuantity(itemShoppingCartDto.getQuantity());
        itemShoppingCart.setSubtotal_price(itemShoppingCartDto.getSubtotal_price());
        return itemShoppingCart;
    }
}
