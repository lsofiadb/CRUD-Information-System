package backend.agricolas.dto;

import backend.agricolas.model.Location;
import lombok.Data;

@Data
public class LocationDto {
    private String department;
    private String municipality;
    private String address;
    private String details;
    private Long person_cc;

    public Location getLocation(LocationDto locationDto){
        Location location = new Location();
        location.setDepartment(locationDto.getDepartment());
        location.setMunicipality(locationDto.getMunicipality());
        location.setAddress(locationDto.getAddress());
        location.setDetails(locationDto.getDetails());
        return location;
    }
}
