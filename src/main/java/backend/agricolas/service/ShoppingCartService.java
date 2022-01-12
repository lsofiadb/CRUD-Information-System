package backend.agricolas.service;

import backend.agricolas.model.ShoppingCart;
import backend.agricolas.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCart addNewShoppingCart(ShoppingCart shoppingCart){
        return shoppingCartRepository.save(shoppingCart);
    }

    public ShoppingCart findShoppingCartById(Long id){
        return shoppingCartRepository.findShoppingCartById(id);
    }

    public List<ShoppingCart> getShoppingCartList(){
        return shoppingCartRepository.findAll();
    }

    public ShoppingCart updateShoppingCart(ShoppingCart shoppingCart){
        return shoppingCartRepository.save(shoppingCart);
    }

    public void deleteShoppingCart(Long id){
        shoppingCartRepository.deleteById(id);
    }

}
