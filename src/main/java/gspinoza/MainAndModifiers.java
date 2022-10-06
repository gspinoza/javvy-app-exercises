package gspinoza;

public class MainAndModifiers {
    // the main method is the "entry point"
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

}

// static variables and methods: 
// static variables and static methods can be invoked without creating an instance of it's class.

class myFirstApp {
    public static void main(String[] args) {
        // invoking static method 
        double m = Meter.toMiles(8.0);
        System.out.println(m);
    }
}

class Meter {
    // static variable
    public static int uses = 0;

    // static method
    public static double toMiles(double m) {
        uses++;
        return m * 0.000621371;
    }
}

// non-static variables and non-static methods:
// to invoke non-static variables or methods an instance (object) of its class needs to be created first.

class Playground {
    public static void main(String[] args) {
        // creating a new instance
        Playground p = new Playground();
        // invoking non-static method from object above
        int myNumber = p.doubleIt(2);
        System.out.println(myNumber);
    }

    // non-static method
    int doubleIt(int number) {
        return number * 2;
    }
}

// modifiers: are ways to allow or restrict access to certain program fields.
// public modifier: the field is accessible from all classes.
// private modifier; the field is accessible only within its own class.

class Account {
    public String owner;
    public String status;
    // private variable
    private double balance;

    public void withdraw(double amount) {
        // accessing private variable
        if (balance > amount) {
            balance -= amount;
        }

        // invoking private method withing the same class
        Status();
    }
    // private method
    private String Status() {
        if (balance > 0) {
            return "good";
        }
        return "bad";
    }
}

// remember, all programs need a class with a main method
class game {
    public static void main(String[] args) {
        Hero BountyHunter = new Hero();
        BountyHunter.name = "Javvy";
        BountyHunter.levelUp();
    }
}

class Hero {
    public String name;
    private int level = 1;

    public void levelUp() {
        if (level < 100) {
            level++;
        }
    }
}