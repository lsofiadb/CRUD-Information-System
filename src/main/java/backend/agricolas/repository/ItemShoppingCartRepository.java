package backend.agricolas.repository;

import backend.agricolas.model.ItemShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemShoppingCartRepository extends JpaRepository<ItemShoppingCart,Long> {
    public ItemShoppingCart findItemShoppingCartById(Long id);
}
