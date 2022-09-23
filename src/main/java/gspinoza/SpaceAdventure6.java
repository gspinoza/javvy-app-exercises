package gspinoza;

import java.util.ArrayList;

public class SpaceAdventure6 {

    public static void main(String[] args) {

        // Samantha has a list of planets she wants to visit soon. At the moment, that's Mars and Mercury,
        // but planets get added and removed all the time. Take care of that write some code.

        // declare and initialize arraylist
        ArrayList<String> planetsToVisit = new ArrayList<String>();
        // add values
        planetsToVisit.add("Mars");
        planetsToVisit.add("Mercury");

        // print current list of planets to visit
        System.out.println(planetsToVisit);
        
        // visited Mars now she wants to visit Saturn

        // remove 'Mars' and add 'Saturn'
        planetsToVisit.remove(0);
        planetsToVisit.add("Saturn");

        // print current list of planets to visit
        System.out.println(planetsToVisit);

    }

}