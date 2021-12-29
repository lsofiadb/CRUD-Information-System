package backend.agricolas.dto;

import backend.agricolas.model.Farm;
import lombok.Data;

@Data
public class FarmDto {
    private String name;
    private String url_image;
    private double land_area;
    private Long location_id;

    public Farm getFarm(FarmDto farmDto){
        Farm farm = new Farm();
        farm.setName(farmDto.getName());
        farm.setUrl_image(farmDto.getUrl_image());
        farm.setLand_area(farmDto.getLand_area());
        return farm;
    }
}
