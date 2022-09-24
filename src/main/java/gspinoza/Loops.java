package gspinoza;

import java.util.HashMap;

public class Loops {

    public static void main(String[] args) {

        // Loops allow us to execute blocks of codes for as long as we want.
        // What roles does control variable play in a loop?
        // Control variable like i are used to regulate the number of times a
        // loop is executed; it is incremented or decremented with every loop run.
        // Remember at some point there has to be a false statement, you don't want an endless loop.

        // "while" loop, checks exit condition then performs tasks
        int number = 4;

        while (number < 10) {
            number++; // increment number while is less than 10, 
        }

        System.out.println(number);

        // "do-while" loop, performs tasks then checks exit condition.
        int number1 = 5;

        do {
            number1++;          // note: a "while" loop wouldn't execute this code block, as the condition of
        } while (number1 < 5);  // (number1 < 5) is false. At times, this concept can be really useful.

        System.out.println(number1);

        // "for" lopp, in this example the control variable i increases every time the loop is executed 
        // until the the run condition becomes false.
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // example 2 "for" loop, in this example the control variable i gets
        // added to sum every time the loop is executed.
        int sum = 0;
        String expression = "0";

        for (int i = 1; i < 3; i++) {
            sum += i;
            expression += "+" + i;
        }
        System.out.println(expression + "=" + sum);

        // Fibonacci numbers is a sequence of numbers where every number is the sum of
        // the previous two.
        int a = 1;
        int b = 1;
        System.out.print("fibonacci sequence first 11 numbers: " + a + "," + b);

        for (int i = 1; i < 10; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print("," + c);
        }

        System.out.print("..." + "\n");

        // 'enhanced loop' - iterate over the elements of an array.
        String[] friends = { "James", "Dann", "David" };

        for (String f : friends) {
            System.out.print(f + ", ");
        }

        System.out.println("");

        // 'enhanced loop', iterate over HashMap
        HashMap<String, String> people = new HashMap<>();
        people.put("Harry", "Seeker");
        people.put("Ginny", "Chaser");

        for (String mykey : people.keySet()) {
            String s = mykey + ": ";
            s += people.get(mykey) + "; ";
            System.out.println(s);
        }

        // nested loops
        for (int i = 1; i < 6; i++) {
            System.out.print(i + ": ");
            int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println("");
        }

        // 'enhanced loop'
        String[] crew = { "David", "Dann", "Vince" };
        for (String f : crew) {
            System.out.println(f + ", ");
        }

        // "while" loop example.
        int year = 1;
        while (year <= 7) {
            System.out.println(year);
            year++;
        }
    }

}