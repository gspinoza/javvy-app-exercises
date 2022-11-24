package gspinoza;

// A class is a blueprint or template which you use to create objects.
// An object is an instance (example) of a class.
// we use methods to give objects a behavior
// A java file can only contain one public class and optionally some private classes.

// main public class
public class ClassAndObjects {
    public static void main(String[] args) {
        System.out.println("executing \"ClassAndObjects\"");
    }
}

// Note: in eclipse ide to run an specific class you can select the class when click the run button.
// In VSCode you can simply click the run button that appears above each main method.

// Other Classes

// dob class "blueprint for dog"
class Dog {
    // properties
    String name;

    // main method
    public static void main(String[] args) {
        // create object
        Dog SiberianWolf = new Dog();
        // give name
        SiberianWolf.name = "Baxter";
        // invoke method
        SiberianWolf.bark();
    }

    // method "behavior of the dog"
    void bark() {
        System.out.println("Woof");
    }
}

// animal class
class Animal {
    // properties
    String name;

    // main method
    public static void main(String[] args) {
        // create object from Animal class
        Animal Wolf = new Animal();
        Wolf.name = "wolf";
        Wolf.move();

        // another object from Animal class
        Animal Lion = new Animal();
        Lion.name = "Lion";
        Lion.eat();
    }

    // methods
    void move() {
        System.out.println("running");
    }

    void eat() {
        System.out.println("eating");
    }

}

// rocket class
class rocket {
    // properties
    int fuel = 1000;
    int mileage = 0;

    // main method
    public static void main(String[] args) {
        // create a new object
        rocket myRocket = new rocket();
        myRocket.move(5);

    }

    // method
    void move(int lightyears) {
        fuel -= 2 * lightyears;
        mileage += lightyears;

        System.out.println("Swoosh!");
    }

}

// superclasses and subclasses: 
// A Java superclass is a class which gives a method or methods to a Java subclass.
// A Java class may be either a subclass, a superclass, both, or neither!
// In the following example the Pet class is the superclass and the cat class is the subclass.

// superclass
class Pet {
    // properties
    public String color;

    // main method
    public static void main(String[] args) { 
        Pet bunny = new Pet();
        bunny.color = "white";
        bunny.eat();
    }

    // INHERITANCE - Here you decide if the subclass will have have access
    // (inherit) to this method by setting the modifiers public or private.
    // When modifiers are set as private it's ENCAPSULATION: only the current class will have access to it.
    
    // public method
    public void eat() {
        System.out.println("A lot");
    }
}

// subclass (note: to declare a subclass we extend it to the superclass)
class Cat extends Pet {
    String name;

    public static void main(String[] args) {

        Cat BengalCat = new Cat();
        BengalCat.name = "Jerry";
        BengalCat.meow();
        // invoking (inheriting) the method from the superclass.
        BengalCat.eat();

        // NOTE: you have the option to override the Superclass method by creating a new one with different
        // behavior in the subclass and giving it the same name as the superclass.
        // You can still invoke the overridden method through the use of the keyword
        // super example -> super."name of super class method();"
    }

    void meow() {
        System.out.println("meow, meow");
    }
}
