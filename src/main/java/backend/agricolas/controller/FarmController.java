package backend.agricolas.controller;

import backend.agricolas.dto.FarmDto;
import backend.agricolas.exception.FarmIdNotFoundException;
import backend.agricolas.model.Farm;
import backend.agricolas.service.FarmService;
import backend.agricolas.service.LocationService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farm")
public class FarmController {
    @Autowired
    private FarmService farmService;

    @Autowired
    private LocationService locationService;

    @PostMapping("/addNewFarm")
    public Farm addNewFarm(@RequestBody FarmDto farmDto){
        Farm farm = farmDto.getFarm(farmDto);
        farm.setLocation(locationService.getLocationById(farmDto.getLocation_id()));
        return farmService.addNewFarm(farm);
    }

    @DeleteMapping("/deleteFarmById/{id}")
    public String deleteFarmById(@PathVariable Long id){
        if(farmService.findById(id).isEmpty()){
            throw new FarmIdNotFoundException("Farm ID: "+id+ " NOT FOUND");
        }else{
            farmService.deleteFarmById(id);
            return "Farm with ID: "+id+ " was deleted successfully";
        }
    }

    @GetMapping("/findFarmById/{id}")
    public Farm findFarmById(@PathVariable Long id){
        if(farmService.existsById(id)==false){
            throw new FarmIdNotFoundException("Farm ID: "+id+ " NOT FOUND");
        }else{
            return farmService.findFarmById(id);
        }
    }

    @GetMapping("/findAllFarms")
    public List<Farm> findAllFarms(){
        return farmService.findAllFarms();
    }

    @PutMapping("/updateFarm")
    public Farm updateFarm(@RequestBody FarmDto farmDto){
        if(farmService.existsById(farmDto.getId())==false){
            throw new FarmIdNotFoundException("Farm ID: "+farmDto.getId()+ " NOT FOUND");
        }else{
            Farm farm = farmDto.getFarm(farmDto);
            farm.setLocation(locationService.getLocationById(farmDto.getLocation_id()));
            return farmService.updateFarm(farm);
        }
    }

    @PatchMapping("/updateFarmURLImage")
    public Farm updateFarmURLImage(@RequestBody String farmData){
        JSONObject requestInfo = new JSONObject(farmData);
        Long id = requestInfo.getLong("id");
        String url_image = requestInfo.getString("url_image");
        if(farmService.existsById(id)==false){
            throw new FarmIdNotFoundException("Farm ID: "+id+ " NOT FOUND");
        }else{
            return farmService.updateFarmImageURL(id, url_image);
        }
    }
}
