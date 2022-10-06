package gspinoza;

public class Constructors {

    public static void main(String[] args) {
        System.out.println("executing class \"Constructors\"");
    }
}

// constructors allow you to specify the initial state of an object

// bicycle class
class Bicycle {
    // class fields
    int gear;
    int cadence;
    int speed;

    // parameterized constructor
    Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // main method "entry point" for Bicycle
    public static void main(String[] args) {
        // creating an instance of the class using the parameterized parameter
        Bicycle MountainBike = new Bicycle(30, 77, 8);
        MountainBike.move();
        System.out.println(MountainBike.speed);
    }

    // method
    void move() {
        System.out.println("Riding fast");
    }

}

// example 2, default costructor and keyword "this"

class Apple {
    String color;
    String shape;

    // default constructor: we don't define any parameters to specify the initial state,
    // but we have to option to initialize the object variables
    Apple() {
        // The 'this' keyword refers to the current object in a method or constructor.
        this.color = "red";
        this.shape = "round";
    }

    public static void main(String[] args) {
        // creating an instance of the class using the default constructor
        Apple myApple = new Apple();
        myApple.grow();
        System.out.println(myApple.color);
    }

    void grow() {
        System.out.println("Growing fast");
    }

}

// super keyword in subclasses: next example will demonstrate the use of superclass variables in a subclass constructor.

// note constructors are not inherited, if we want to create a constructor in
// a subclass, we need to call the constructor in our superclass using super();

// superclass
class Petsuper {
    String color;

    // default constructot
    Petsuper() {
        this.color = "white";
    }

    public static void main(String[] args) {
        // creating a new instance using the dafault constructor
        Petsuper bunny = new Petsuper();
        bunny.eat();
    }

    void eat() {
        System.out.println("bunny eating...");
    }
}

// subclass (remember: to declare a subclass use "class class-name extends superclass-name")
class Catsub extends Petsuper {
    String name;

    // parameterized constructor
    Catsub(String givenName) {
        // invoking the super class constructor (remember by design all classes have a default constructor!)
        super();
        // the super constructor has knowledge about the superclass variable color.
        // hence, the super constructor allows us to use variable color in this subclass constructor
        this.color = "red";
        this.name = givenName;
    }

    public static void main(String[] args) {
        // creating a new object using the parameterized constuctor
        Catsub LeopardCat = new Catsub("Foxy");
        LeopardCat.meow();
        System.out.println(LeopardCat.name);
        System.out.println(LeopardCat.color);
    }

    void meow() {
        System.out.println("meow, meow");
    }
}

// example 2 - accessing superclass constructor with defined parameters 

// subclass
class Petsuperclass {
    String color;

    // parameterized constructor
    Petsuperclass(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        // creating a new object
        Petsuperclass bunny = new Petsuperclass("white");
        bunny.eat();
        System.out.println(bunny.color);
    }

    void eat() {
        System.out.println("eating carrot..");
    }
}

// subclass
class Catsubclass extends Petsuperclass {
    String name;

    // parameterized constructor
    Catsubclass(String givenName, String color) {
        // invoking the superclass constructor, which know how to handle the variable color.
        super(color); 
        this.name = givenName;
    }

    public static void main(String[] args) {
        // creating a new object
        Catsubclass LeopardCat = new Catsubclass("Foxy", "Orange");
        LeopardCat.meow();
        System.out.println(LeopardCat.name);
        System.out.println(LeopardCat.color);
    }

    void meow() {
        System.out.println("meow, meow");
    }
}