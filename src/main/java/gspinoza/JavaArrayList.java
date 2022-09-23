package gspinoza;

import java.util.ArrayList; // import ArrayList
import java.util.Arrays; // import array methods

public class JavaArrayList {

    public static void main(String[] args) {

        // ArrayList is an "ordered list" that holds a dynamic number of values of objects or specified types of objects.
        // Arrays capacity cannot change but with ArrayList We can add and remove values
        // and it can hold any type of value, but we restrict the type.

        // declaring and initializing string arraylist
        ArrayList<String> ecosystem = new ArrayList<>();

        // add values
        ecosystem.add("Tundra");
        ecosystem.add("Jungle");
        ecosystem.add("Desert");
        ecosystem.add("Grassland");
        ecosystem.add("Caves");
        ecosystem.add("Rivers");
        ecosystem.add("Forest");
        ecosystem.add("Oceans");
        ecosystem.add("Antartic");
        ecosystem.add("Mountains");

        // print ArrayList
        System.out.println(ecosystem);

        // convert Arraylist into a single string by using join()
        String outputString = String.join(",", ecosystem);
        System.out.println(outputString);

        // accessing element 4, remember ArrayList are also zero-based.
        System.out.println(ecosystem.get(3));

        // modifying a value at an specific index
        ecosystem.set(6, "Tropical Forest");
        System.out.println(ecosystem.get(6));

        // removing a value at an specific index
        ecosystem.remove(9);
        System.out.println(ecosystem);

        // print ArrayList size
        System.out.println(ecosystem.size());
        // check if ArrayList is empty or not.
        boolean bool = ecosystem.isEmpty();

        if (bool) {
            System.out.println("ecosystem is empty");
        } else {
            System.out.println("ecosystem is not empty");
        }

        // alternative way to check if ArrayList is empty or not.
        boolean bool2 = ecosystem.size() == 0;

        if (bool2) {
            System.out.println("ecosystem is empty");
        } else {
            System.out.println("ecosystem is not empty");
        }

        // converting ArrayList into an Array of Strings
        String[] Ecozones01 = ecosystem.toArray(new String[ecosystem.size()]);
        // converting array String[] into a single String
        String Ecozones = Arrays.toString(Ecozones01);
        System.out.println(Ecozones);

        // check type of variables
        System.out.println(ecosystem.getClass().getSimpleName());
        System.out.println(Ecozones01.getClass().getSimpleName());
        System.out.println(Ecozones.getClass().getSimpleName());
    }

}