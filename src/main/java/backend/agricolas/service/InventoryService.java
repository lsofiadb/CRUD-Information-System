package backend.agricolas.service;

import backend.agricolas.model.Farm;
import backend.agricolas.model.Inventory;
import backend.agricolas.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<Inventory> findInventoryByFarm(Farm farm){
        return inventoryRepository.findInventoryByFarm(farm);
    }

    public List<Inventory> findAllInventories(){
        return inventoryRepository.findAll();
    }

    public void deleteInventoryById(Long id){
        inventoryRepository.deleteById(id);
    }

    public void deleteInventoryByFarm(Farm farm){
        List<Inventory> inventoryList = new ArrayList<>();
        inventoryList = findInventoryByFarm(farm);
        for(Inventory i: inventoryList){
            inventoryRepository.delete(i);
        }
    }

    public Inventory updateInventory(Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    public Inventory updateInventoryPrice(Long id, double price){
        Inventory inventoryUpdated = findInventoryById(id);
        inventoryUpdated.setPrice(price);
        return inventoryRepository.save(inventoryUpdated);
    }
}
