/**
 * A location is a place that the salesman can travel to.
 * It has an x-y location on the "Map"
 * It is also possible to calculate the distance between two locations
 * Created by Martin on 11-1-2016.
 */
public class Location {

    private int x;
    private int y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double calculateDistanceTo(Location location){
        int deltaX = Math.abs(this.x - location.x);
        int deltaY = Math.abs(this.y - location.y);

        return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
    }
}
