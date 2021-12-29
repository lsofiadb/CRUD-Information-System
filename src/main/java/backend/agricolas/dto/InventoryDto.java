package backend.agricolas.dto;

import backend.agricolas.model.Inventory;
import lombok.Data;

@Data
public class InventoryDto {
    private Long stock;
    private double price;
    private String url_image;
    private Long farm_id;
    private Long product_code;

    public Inventory getInventory(InventoryDto inventoryDto){
        Inventory inventory = new Inventory();
        inventory.setStock(inventoryDto.getStock());
        inventory.setPrice(inventoryDto.getPrice());
        inventory.setUrl_image(inventoryDto.getUrl_image());
        return inventory;
    }
}
