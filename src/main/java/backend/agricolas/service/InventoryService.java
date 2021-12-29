package backend.agricolas.service;

import backend.agricolas.model.Inventory;
import backend.agricolas.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory addNewInventory(Inventory inventory){
        return inventoryRepository.save(inventory);
    }
    public Inventory findInventoryById(Long id){
        return inventoryRepository.findInventoryById(id);
    }
}
