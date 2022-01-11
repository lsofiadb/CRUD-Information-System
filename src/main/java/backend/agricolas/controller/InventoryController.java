package backend.agricolas.controller;

import backend.agricolas.dto.InventoryDto;
import backend.agricolas.model.Inventory;
import backend.agricolas.service.FarmService;
import backend.agricolas.service.InventoryService;
import backend.agricolas.service.ProductService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/findInventoryByFarmId/{id}")
    public List<Inventory> findInventoryByFarm(@PathVariable Long id){
        return inventoryService.findInventoryByFarm(farmService.findFarmById(id));
    }

    @GetMapping("/findAllInventories")
    public List<Inventory> findAllInventories(){
        return inventoryService.findAllInventories();
    }

    @DeleteMapping("/deleteInventoryById/{id}")
    public void deleteInventoryById(@PathVariable Long id){
        inventoryService.deleteInventoryById(id);
    }

    @DeleteMapping("/deleteInventoryByFarmId/{id}")
    public void deleteInventoryByFarmId(@PathVariable Long id){
        inventoryService.deleteInventoryByFarm(farmService.findFarmById(id));
    }

    @PutMapping("/updateInventory")
    public Inventory updateInventory(@RequestBody InventoryDto inventoryDto){
        Inventory inventory = inventoryDto.getInventory(inventoryDto);
        inventory.setFarm(farmService.findFarmById(inventoryDto.getFarm_id()));
        inventory.setProduct(productService.findProductByCode(inventoryDto.getProduct_code()));
        return inventoryService.updateInventory(inventory);
    }

    @PatchMapping("/updateInventoryPrice")
    public Inventory updateInventoryPrice(@RequestBody String inventoryInfo){
        Long id = 0L;
        double price = 0.0f;
        JSONObject json = new JSONObject(inventoryInfo);
        id = json.getLong("id");
        price = json.getDouble("price");
        return inventoryService.updateInventoryPrice(id,price);
    }
}
