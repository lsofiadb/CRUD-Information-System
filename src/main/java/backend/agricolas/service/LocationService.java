package backend.agricolas.service;

import backend.agricolas.model.Location;
import backend.agricolas.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Location> findAllLocations(){
        return locationRepository.findAll();
    }

    public Location updateLocation(Location location){
        return locationRepository.save(location);
    }

    public void deleteLocation(Long id){
        locationRepository.deleteById(id);
    }
}
