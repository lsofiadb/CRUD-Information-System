package backend.agricolas.controller;

import backend.agricolas.dto.ItemShoppingCartDto;
import backend.agricolas.model.Inventory;
import backend.agricolas.model.ItemShoppingCart;
import backend.agricolas.service.InventoryService;
import backend.agricolas.service.ItemShoppingCartService;
import backend.agricolas.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/findItemShoppingCartById/{id}")
    public ItemShoppingCart findItemShoppingCartById(@PathVariable Long id){
        return itemShoppingCartService.findItemShoppingCartById(id);
    }

    @GetMapping("/findAllItemShoppingCarts")
    public List<ItemShoppingCart> findAllItemShoppingCarts(){
        return itemShoppingCartService.findAllItemShoppingCarts();
    }

    @PutMapping("/updateItemShoppingCart")
    public ItemShoppingCart updateItemShoppingCart(@RequestBody ItemShoppingCartDto itemShoppingCartDto){
        ItemShoppingCart itemShoppingCart = itemShoppingCartDto.getItemShoppingCart(itemShoppingCartDto);
        itemShoppingCart.setShoppingCart(shoppingCartService.findShoppingCartById(itemShoppingCartDto.getShopping_cart_id()));
        itemShoppingCart.setInventory(inventoryService.findInventoryById(itemShoppingCartDto.getInventory_id()));
        return itemShoppingCartService.updateItemShoppingCart(itemShoppingCart);
    }

    @DeleteMapping("/deleteItemShoppingCartById/{id}")
    public String deleteItemShoppingCartById(@PathVariable Long id){
        itemShoppingCartService.deleteItemShoppingCartById(id);
        return "ItemShoppingCart with ID: "+id+" was deleted";
    }
}
