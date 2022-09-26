package gspinoza;

public class SpaceAdventure10 {

    public static void main(String[] args) {
        // Let's create a method that helps "Sam" calculate the time it takes to travel
        // a certain distance! The method should take two doubles as arguments: 
        // the distance to a planet and the speed of travel.

        // invoked method
        double t = calcTime(123.5, 19.0);
        System.out.println("Estimated Time Arrival: " + t);
    }

    // Method to calculate time
    // note: the method is outside the main method, but inside the class.
    public static double calcTime(double distance, double speed) {
        return distance / speed;
    }

}