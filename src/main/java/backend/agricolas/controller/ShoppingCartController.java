package backend.agricolas.controller;

import backend.agricolas.dto.ShoppingCartDto;
import backend.agricolas.model.ShoppingCart;
import backend.agricolas.service.FarmService;
import backend.agricolas.service.PersonService;
import backend.agricolas.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getShoppingCartById/{id}")
    public ShoppingCart getShoppingCartById(@PathVariable Long id){
        return shoppingCartService.findShoppingCartById(id);
    }

    @GetMapping("/findAllShoppingCarts")
    public List<ShoppingCart> findAllShoppingCarts(){
        return shoppingCartService.getShoppingCartList();
    }

    @PutMapping("/updateShoppingCart")
    public ShoppingCart updateShoppingCart(@RequestBody ShoppingCartDto shoppingCartDto){
        ShoppingCart shoppingCart = shoppingCartDto.getShoppingCart(shoppingCartDto);
        shoppingCart.setPerson(personService.findPersonByCC(shoppingCartDto.getPerson_cc()));
        shoppingCart.setFarm(farmService.findFarmById(shoppingCartDto.getFarm_id()));
        return shoppingCartService.updateShoppingCart(shoppingCart);
    }

    @DeleteMapping("/deleteShoppingCartById/{id}")
    public String deleteShoppingCartById(@PathVariable Long id){
        shoppingCartService.deleteShoppingCart(id);
        return "ShoppingCart with ID: "+id+" was deleted";
    }
}
