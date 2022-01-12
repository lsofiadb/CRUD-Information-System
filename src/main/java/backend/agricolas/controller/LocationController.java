package backend.agricolas.controller;

import backend.agricolas.dto.LocationDto;
import backend.agricolas.model.Location;
import backend.agricolas.service.LocationService;
import backend.agricolas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locationController")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @Autowired
    private PersonService personService;

    @PostMapping("/addNewLocation")
    public Location addNewLocation(@RequestBody LocationDto locationDto){
        Location location = locationDto.getLocation(locationDto);
        location.setPerson(personService.findPersonByCC(locationDto.getPerson_cc()));
        return locationService.addNewLocation(location);
    }

    @GetMapping("/findLocationById/{id}")
    public Location findLocationById(@PathVariable Long id){
        return locationService.getLocationById(id);
    }

    @GetMapping("/findAllLocations")
    public List<Location> findAllLocations(){
        return locationService.findAllLocations();
    }

    @PutMapping("/updateLocation")
    public Location updateLocation(@RequestBody LocationDto locationDto){
        Location location = locationDto.getLocation(locationDto);
        location.setPerson(personService.findPersonByCC(locationDto.getPerson_cc()));
        return locationService.updateLocation(location);
    }

    @DeleteMapping("/deleteLocationById/{id}")
    public String deleteLocation(@PathVariable Long id){
        locationService.deleteLocation(id);
        return "Location with ID: "+id+" was deleted";
    }
}
