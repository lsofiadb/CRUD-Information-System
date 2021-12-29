package backend.agricolas.controller;

import backend.agricolas.dto.LocationDto;
import backend.agricolas.model.Location;
import backend.agricolas.service.LocationService;
import backend.agricolas.service.PersonService;
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

    @Autowired
    private PersonService personService;

    @PostMapping("/addNewLocation")
    public Location addNewLocation(@RequestBody LocationDto locationDto){
        Location location = locationDto.getLocation(locationDto);
        location.setPerson(personService.findPersonByCC(locationDto.getPerson_cc()));
        return locationService.addNewLocation(location);
    }
}
