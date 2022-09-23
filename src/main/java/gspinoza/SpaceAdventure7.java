package gspinoza;

import java.util.HashMap; // import HashMap util

public class SpaceAdventure7 {

    public static void main(String[] args) {

        // Samantha wants to remember her crew members by their nicknames.
        // Let's help her by creating a HashMap that uses nicknames as
        // keys to their real names. Finally, pick one and print it.

        HashMap<String, String> CrewMember = new HashMap<>();
        CrewMember.put("Leo", "Leonardo");
        CrewMember.put("Gabe", "Gabriel");
        CrewMember.put("Alex", "Alexander");
        CrewMember.put("Dan", "Danny");
        CrewMember.put("David", "Davidson");

        // printing all
        System.out.println(CrewMember);

        // Retrieving just one pair
        String output = CrewMember.get("David");
        System.out.println(output);
    }

}