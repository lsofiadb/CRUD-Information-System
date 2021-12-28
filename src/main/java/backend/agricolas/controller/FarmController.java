package backend.agricolas.controller;

import backend.agricolas.model.Farm;
import backend.agricolas.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farm")
public class FarmController {
    @Autowired
    private FarmService farmService;

    @PostMapping("/addNewFarm")
    public Farm addNewFarm(Farm farm){
        return farmService.addNewFarm(farm);
    }
}
