package backend.agricolas.controller;

import backend.agricolas.model.ItemShoppingCart;
import backend.agricolas.service.ItemShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itemShoppingCart")
public class ItemShoppingCartController {

    @Autowired
    ItemShoppingCartService itemShoppingCartService;

    @PostMapping("/addNewItemShoppingCart")
    public ItemShoppingCart addNewItemShoppingCart(ItemShoppingCart itemShoppingCart){
        return itemShoppingCartService.addNewItemShoppingCart(itemShoppingCart);
    }


}
