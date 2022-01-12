package backend.agricolas.service;

import backend.agricolas.model.ItemShoppingCart;
import backend.agricolas.repository.ItemShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemShoppingCartService {
    @Autowired
    private ItemShoppingCartRepository itemShoppingCartRepository;

    public ItemShoppingCart addNewItemShoppingCart(ItemShoppingCart itemShoppingCart){
        return itemShoppingCartRepository.save(itemShoppingCart);
    }

    public ItemShoppingCart findItemShoppingCartById(Long id){
        return itemShoppingCartRepository.findItemShoppingCartById(id);
    }

    public List<ItemShoppingCart> findAllItemShoppingCarts(){
        return itemShoppingCartRepository.findAll();
    }

    public ItemShoppingCart updateItemShoppingCart(ItemShoppingCart itemShoppingCart){
        return itemShoppingCartRepository.save(itemShoppingCart);
    }

    public void deleteItemShoppingCartById(Long id){
        itemShoppingCartRepository.delete(findItemShoppingCartById(id));
    }
}
