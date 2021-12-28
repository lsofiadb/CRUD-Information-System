package backend.agricolas.controller;

import backend.agricolas.model.Location;
import backend.agricolas.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locationController")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @PostMapping("/addNewLocation")
    public Location addNewLocation(@RequestBody Location location){
        return locationService.addNewLocation(location);
    }
}
