package backend.agricolas.repository;

import backend.agricolas.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long>{
    public ShoppingCart findShoppingCartById(Long id);
}
