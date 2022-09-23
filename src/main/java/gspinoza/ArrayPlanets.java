package gspinoza;

public class ArrayPlanets {
    static String[] planets = {"Mercury", "Venus","Earth", "Mars","Jupiter","Saturn","Uranus", "Neptune"};

	public static void main(String[] args) {
		// solution	
		int currentLevel = 4;
		String planet = planets[--currentLevel];
		String results = "Samantha can Travel to Planet "+ planet;
		System.out.println(results);

        // alternative 1 line Solution
        // System.out.println("Samantha can Travel to Planet "+ planets[--currentLevel]);

        // old newbie solution :(
		int level = 4;
		
		if (level == 1) {
            System.out.println("you can travel to Planet " + planets[0]);
        } else if (level == 2) {
			System.out.println("you can travel to Planet " + planets[1]);
        } else if (level == 3) {
            System.out.println("you can travel to Planet " + planets[2]);
        } else if (level == 4) {
		    System.out.println("you can travel to Planet " + planets[3]);
        } else if (level == 5) {
	    	System.out.println("you can travel to Planet " + planets[4]);
        } else if (level == 6) {
		    System.out.println("you can travel to Planet " + planets[5]);
        } else if (level == 7) {
		    System.out.println("you can travel to Planet " + planets[6]);
        } else if (level == 8) {
		    System.out.println("you can travel to Planet " + planets[7]);
        }		
	}

}