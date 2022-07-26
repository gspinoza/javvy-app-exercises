package gspinoza;

public class VisitingPlanets {

    public static void mani(String args[]) {
        int goal = 7;
        int planetsVisited = 3;
        int planetsLeft = goal - planetsVisited;

        if (planetsLeft >= goal) {
            System.out.print("Goal Reached!");
        } else  {
            System.out.print("you still have " + planetsLeft + " planets left to visit.");	
        }
    }
}