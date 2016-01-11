/**
 * This class inserts test data in the route wrapper.
 * This data will be used to find the optimal route in this program
 * Created by Martin on 11-1-2016.
 */
public class LocationGenerator {
    private RouteWrapper wrapper;

    public LocationGenerator(RouteWrapper routeWrapper){
        this.wrapper = routeWrapper;
    }

    public void fillRouteWrapper(){
        Location location1 = new Location(60, 200);
        Location Location2 = new Location(180, 200);
        Location Location3 = new Location(80, 180);
        Location Location4 = new Location(140, 180);
        Location Location5 = new Location(20, 160);
        Location Location6 = new Location(100, 160);
        Location Location7 = new Location(200, 160);
        Location Location8 = new Location(140, 140);
        Location Location9 = new Location(40, 120);
        Location Location10 = new Location(100, 120);
        Location Location11 = new Location(180, 100);
        Location Location12 = new Location(60, 80);
        Location Location13 = new Location(120, 80);
        Location Location14 = new Location(180, 60);
        Location Location15 = new Location(20, 40);
        Location Location16 = new Location(100, 40);
        Location Location17 = new Location(200, 40);
        Location Location18 = new Location(20, 20);
        Location Location19 = new Location(60, 20);
        Location Location20 = new Location(160, 20);

        this.wrapper.addLocation(0, location1);
        this.wrapper.addLocation(1, Location2);
        this.wrapper.addLocation(2, Location3);
        this.wrapper.addLocation(3, Location4);
        this.wrapper.addLocation(4, Location5);
        this.wrapper.addLocation(5, Location6);
        this.wrapper.addLocation(6, Location7);
        this.wrapper.addLocation(7, Location8);
        this.wrapper.addLocation(8, Location9);
        this.wrapper.addLocation(9, Location10);
        this.wrapper.addLocation(10, Location11);
        this.wrapper.addLocation(11, Location12);
        this.wrapper.addLocation(12, Location13);
        this.wrapper.addLocation(13, Location14);
        this.wrapper.addLocation(14, Location15);
        this.wrapper.addLocation(15, Location16);
        this.wrapper.addLocation(16, Location17);
        this.wrapper.addLocation(17, Location18);
        this.wrapper.addLocation(18, Location19);
        this.wrapper.addLocation(19, Location20);
    }
}
