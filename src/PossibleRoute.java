import java.util.Arrays;
import java.util.Collections;

/**
 * This class contains the possible route.
 * This can be the best solution
 * Created by Martin on 11-1-2016.
 */
public class PossibleRoute {
    private Location[] locationList = new Location[20];
    private RouteWrapper routeWrapper;
    private double totalDistance = 0;

    public PossibleRoute(RouteWrapper routeWrapper){
        this.routeWrapper = routeWrapper;
        for (int i = 0; i < routeWrapper.numberOfLocations(); i++){
            locationList[i] = null;
        }
    }

    public void setLocationList(Location[] locationList){
        this.locationList = locationList;
        totalDistance = 0;
    }

    public Location[] getLocationList(){
        return locationList;
    }

    public int locationListSize(){
        return locationList.length;
    }

    public void generateRandomStartPossRoute(){
        for (int i = 0; i < routeWrapper.numberOfLocations(); i++){
            insertLocation(i, routeWrapper.getLocation(i));
        }
        randomizeRoute();
    }

    public Location getLocation(int routePosition){
        return locationList[routePosition];
    }

    public void insertLocation(int positionInRoute, Location location){
        this.locationList[positionInRoute] = location;
        totalDistance = 0;
    }

    public double getTotalDistance(){
        if (totalDistance <= 0){
            double calcDistance = 0;
            for (int i = 0; i < locationListSize(); i++){
                Location from = getLocation(i);
                Location to;

                if (i + 1 < locationListSize()){
                    to = getLocation(i + 1);
                } else {
                    to = getLocation(0);
                }

                calcDistance += from.calculateDistanceTo(to);
            }
            totalDistance = calcDistance;
        }
        return totalDistance;
    }

    private void randomizeRoute(){
        Collections.shuffle(Arrays.asList(this.locationList));
    }
}
