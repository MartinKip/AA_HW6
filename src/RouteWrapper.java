/**
 * Wrapper class, used to handle a location list
 * Created by Martin on 11-1-2016.
 */
public class RouteWrapper {
    private Location[] allLocations = new Location[20];

    public void addLocation(int index, Location location){
        this.allLocations[index] = location;
    }

    public Location getLocation(int index){
        return allLocations[index];
    }

    public int numberOfLocations(){
        return allLocations.length;
    }
}
