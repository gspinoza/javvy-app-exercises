package gspinoza;

public class SpaceAdventure8 {

    public static void main(String[] args) {

        // Write some code to help Samantha print() the name of the last planet
        // she went to and the total number of visited planets.

        // solution

        String[] VisitedPlanets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

        int TotalVisited = VisitedPlanets.length;
        TotalVisited--;

        String LastPlanet = VisitedPlanets[TotalVisited];

        if (LastPlanet.endsWith(VisitedPlanets[TotalVisited])) {
            System.out.println("Samantha has visited " + TotalVisited + " Planets and the last one was " + LastPlanet);
        }

        // solution Javvy version

        String planet = "Saturn";
        int count = 7;

        String output = planet + " was #" + count + "!";
        System.out.println(output);

    }

}
