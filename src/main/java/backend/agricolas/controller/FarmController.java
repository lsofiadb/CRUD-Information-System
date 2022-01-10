package backend.agricolas.controller;

import backend.agricolas.dto.FarmDto;
import backend.agricolas.model.Farm;
import backend.agricolas.service.FarmService;
import backend.agricolas.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public void deleteFarmById(@PathVariable Long id){
        farmService.deleteFarmById(id);
    }

    @GetMapping("/findFarmById/{id}")
    public Farm findFarmById(@PathVariable Long id){
        return farmService.findFarmById(id);
    }

    @PutMapping("/updateFarm")
    public Farm updateFarm(@RequestBody FarmDto farmDto){
        return addNewFarm(farmDto);
    }
}
