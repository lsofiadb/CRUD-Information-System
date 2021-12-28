package backend.agricolas.controller;

import backend.agricolas.model.ShoppingCart;
import backend.agricolas.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/addNewShoppingCart")
    public ShoppingCart addNewShoppingCart(@RequestBody ShoppingCart shoppingCart){
        return shoppingCartService.addNewShoppingCart(shoppingCart);
    }
}
