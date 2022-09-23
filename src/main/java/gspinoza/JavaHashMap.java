package gspinoza;

import java.util.HashMap; // import HashMap util

public class JavaHashMap {

    public static void main(String[] args) {

        // HasMaps is a data structure that can map keys to values.
        // In a way they are like dictionaries: every key points to a value.
        // A HashMap can take objects (class Characters, Strings, Booleans, Integers),
        // but it can't be of a primitive (int,char,double,boolean,etc)

        // The difference between array and HashMap
        // An array is an "ordered list" of values. To access a value, we need to
        // remember its index.
        // A HashMap is an "unordered list", where every value has a key pointing to it.
        // to access a value of a HashMap, we need to have its key.

        // declare and initialize HashMap note "<>" it's called diamond
        HashMap<String, String> mymap = new HashMap<>();

        // adding elements, .put() takes two arguments, a key and a value.
        mymap.put("Grassland", "Zebras");
        mymap.put("Tundra", "Elk");
        mymap.put("Rivers", "Piranha");

        // printing the HashMap
        System.out.println(mymap);

        // check the size of the HashMap
        System.out.println(mymap.size());

        // this HashMap has Integer as key and String as values.
        HashMap<Integer, String> WildCats = new HashMap<>();
        WildCats.put(100, "Lion");
        WildCats.put(25, "Tiger");
        WildCats.put(30, "Leopard");
        WildCats.put(44, "Moutain Lion");
        WildCats.put(7, "Snow Leopard");

        // accessing a value in the HashMap
        String value = WildCats.get(7);
        System.out.println(value);

        // checking if HashMap is empty
        boolean empty = WildCats.isEmpty();

        if (empty) {
            String output = "HashMap is empty!";
            System.out.println(output);
        } else {
            String output = "HashMap is not empty!";
            System.out.println(output);
        }

        // removing a value from HashMap
        WildCats.remove(44);
        System.out.println(WildCats);

        // replacing a value in HashMap
        WildCats.put(25, "Siberian Tiger");
        System.out.println(WildCats);

        // we get null if we try to get value using key that doesn't exist.
        String element = WildCats.get(77);
        System.out.println(element);

    }

}