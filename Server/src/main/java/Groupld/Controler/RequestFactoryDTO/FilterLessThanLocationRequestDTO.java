package Groupld.Controler.RequestFactoryDTO;

import Groupld.Controler.CollectionObjects.Location;

public class FilterLessThanLocationRequestDTO implements RequestDTO {
    private Location location;
    public FilterLessThanLocationRequestDTO(Location location){
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
