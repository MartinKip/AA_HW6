import java.util.Random;

/**
 * Main class, creates initial route, randomizes it and then tries to find the best route
 * Created by Martin on 10-1-2016.
 */
public class TravelingSalesPerson {

    public void findOptimalRoute(){
        RouteWrapper routeWrapper = new RouteWrapper();
        LocationGenerator lg = new LocationGenerator(routeWrapper);
        lg.fillRouteWrapper();
        PossibleRoute bestRoute = new PossibleRoute(routeWrapper);
        bestRoute.generateRandomStartPossRoute();
        double currentRouteDistance = bestRoute.getTotalDistance();
        System.out.println("Begin random length: " + currentRouteDistance);

        int triesToFindBestRoute = 0;
        Random random = new Random();

        int maxTries = 10000;
        while (triesToFindBestRoute < maxTries){
            PossibleRoute testRoute = new PossibleRoute(routeWrapper);
            testRoute.setLocationList(bestRoute.getLocationList());

            int pos1 = (int)(testRoute.locationListSize() * random.nextDouble());
            int pos2 = (int)(testRoute.locationListSize() * random.nextDouble());

            Location locationSwap1 = testRoute.getLocation(pos1);
            Location locationSwap2 = testRoute.getLocation(pos2);

            testRoute.insertLocation(pos2, locationSwap1);
            testRoute.insertLocation(pos1, locationSwap2);

            double testRouteDistance = testRoute.getTotalDistance();
            if (currentRouteDistance > testRouteDistance){
                bestRoute.setLocationList(testRoute.getLocationList());
                currentRouteDistance = testRouteDistance;

                System.out.println("Found better solution of: " + bestRoute.getTotalDistance());
                triesToFindBestRoute = 0;
            } else {
                triesToFindBestRoute++;
            }
        }
    }

    public static void main(String[] args){
        TravelingSalesPerson tsp = new TravelingSalesPerson();
        tsp.findOptimalRoute();
    }
}
