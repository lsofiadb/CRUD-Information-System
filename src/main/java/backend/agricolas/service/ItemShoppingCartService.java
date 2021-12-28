package backend.agricolas.service;

import backend.agricolas.model.ItemShoppingCart;
import backend.agricolas.repository.ItemShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemShoppingCartService {
    @Autowired
    private ItemShoppingCartRepository itemShoppingCartRepository;

    public ItemShoppingCart addNewItemShoppingCart(ItemShoppingCart itemShoppingCart){
        return itemShoppingCartRepository.save(itemShoppingCart);
    }
}
