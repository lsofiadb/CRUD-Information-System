package backend.agricolas.service;

import backend.agricolas.model.Location;
import backend.agricolas.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public Location addNewLocation(Location location){
        return locationRepository.save(location);
    }

    public Location getLocationById(Long id){
        return locationRepository.findLocationById(id);
    }
}
