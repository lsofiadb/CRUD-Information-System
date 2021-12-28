package backend.agricolas.controller;

import backend.agricolas.model.Inventory;
import backend.agricolas.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/addNewInventory")
    public Inventory addNewInventory(@RequestBody Inventory inventory){
        return inventoryService.addNewInventory(inventory);
    }
}
