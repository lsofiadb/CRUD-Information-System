package backend.agricolas.repository;

import backend.agricolas.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    public Inventory findInventoryById(Long id);
}
