package backend.agricolas.controller;

import backend.agricolas.dto.ShoppingCartDto;
import backend.agricolas.model.ShoppingCart;
import backend.agricolas.service.FarmService;
import backend.agricolas.service.PersonService;
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
    @Autowired
    private FarmService farmService;
    @Autowired
    private PersonService personService;

    @PostMapping("/addNewShoppingCart")
    public ShoppingCart addNewShoppingCart(@RequestBody ShoppingCartDto shoppingCartDto){
        ShoppingCart shoppingCart = shoppingCartDto.getShoppingCart(shoppingCartDto);
        shoppingCart.setFarm(farmService.findFarmById(shoppingCartDto.getFarm_id()));
        shoppingCart.setPerson(personService.findPersonByCC(shoppingCartDto.getPerson_cc()));
        return shoppingCartService.addNewShoppingCart(shoppingCart);
    }
}
