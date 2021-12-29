package backend.agricolas.controller;

import backend.agricolas.dto.InventoryDto;
import backend.agricolas.model.Inventory;
import backend.agricolas.service.FarmService;
import backend.agricolas.service.InventoryService;
import backend.agricolas.service.ProductService;
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
    @Autowired
    private FarmService farmService;
    @Autowired
    private ProductService productService;

    @PostMapping("/addNewInventory")
    public Inventory addNewInventory(@RequestBody InventoryDto inventoryDto){
        Inventory inventory = inventoryDto.getInventory(inventoryDto);
        inventory.setFarm(farmService.findFarmById(inventoryDto.getFarm_id()));
        inventory.setProduct(productService.findProductByCode(inventoryDto.getProduct_code()));
        return inventoryService.addNewInventory(inventory);
    }
}
