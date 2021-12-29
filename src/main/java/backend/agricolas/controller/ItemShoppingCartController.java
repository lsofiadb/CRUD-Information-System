package backend.agricolas.controller;

import backend.agricolas.dto.ItemShoppingCartDto;
import backend.agricolas.model.Inventory;
import backend.agricolas.model.ItemShoppingCart;
import backend.agricolas.service.InventoryService;
import backend.agricolas.service.ItemShoppingCartService;
import backend.agricolas.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itemShoppingCart")
public class ItemShoppingCartController {

    @Autowired
    ItemShoppingCartService itemShoppingCartService;
    @Autowired
    ShoppingCartService shoppingCartService;
    @Autowired
    InventoryService inventoryService;

    @PostMapping("/addNewItemShoppingCart")
    public ItemShoppingCart addNewItemShoppingCart(@RequestBody ItemShoppingCartDto itemShoppingCartDto){
        ItemShoppingCart itemShoppingCart = itemShoppingCartDto.getItemShoppingCart(itemShoppingCartDto);
        itemShoppingCart.setShoppingCart(shoppingCartService.findShoppingCartById(itemShoppingCartDto.getShopping_cart_id()));
        itemShoppingCart.setInventory(inventoryService.findInventoryById(itemShoppingCartDto.getInventory_id()));
        return itemShoppingCartService.addNewItemShoppingCart(itemShoppingCart);
    }


}
