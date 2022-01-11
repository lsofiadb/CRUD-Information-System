package backend.agricolas.repository;

import backend.agricolas.model.Farm;
import backend.agricolas.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    public Inventory findInventoryById(Long id);
    public List<Inventory> findInventoryByFarm(Farm farm);
}
