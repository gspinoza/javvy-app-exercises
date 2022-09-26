package gspinoza;

// Create a class for Spaceships like Samantha's. We need a name, a variable for
// the fuel. A variable that tells us, if a jump to HyperSpeed is possible.

public class SpaceAdventure11 {
    public static void main(String[] args) {

        Spaceship starship = new Spaceship();
        starship.ShipName = "Starship";
        starship.fuel = 100;
        starship.HyperSpeed = true;

        if (starship.HyperSpeed) {
            starship.Hyperspeed();
        } else {
            System.out.println("Hyperspeed is Not Supported");
        }
    }
}

// my Solution

class Spaceship {
    String ShipName;
    int fuel;
    boolean HyperSpeed;

    void Hyperspeed() {
        System.out.println("HyperSpeed is possible!");
    }

}

// Solution Javvy Version

class ship {
    String name;
    int fuel = 100;
    boolean hyperspeed = false;

    ship(String name) {
        this.name = name;

    }

}