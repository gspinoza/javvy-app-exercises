package gspinoza;

    // Methods is a named block of code. or a collection of statements performing actions.
    // Methods make out code more readable and reusable. Besides, they're handy and
    // easy to use! There's no need to be scared: methods make our lives a lot easier.
    // If we want to use a block of code more often, it's a good idea to put it in a
    // method. Once it's written, we can reuse that block whenever we want.
    // Finally, methods are defined inside the class, but outside the main method.

public class Methods {

    public static void main(String[] args) {

        // note System.out.println(); is a method we've used.
        // we're passing the 'hello!' string to system.out.print() which will print in to the console.
        System.out.println("hello!");

        // invoking defined methods
        
        sayHi();
        
        multiplyIt(8);

        sayHello("Ben", "Luke");

        // We can assign the returned value to a variable.
        int myNumber = doubleIt(13);
        System.out.println(myNumber);

        String[] myFriends = { "Danny", "James" };
        printArray(myFriends);

        int sum = sumUp(8, 1, 5);
        System.out.println(sum);

        int[] myNumbers = { 3, -4, 0 };
        process(myNumbers);

        int myNum = 21;
        plusFive(myNum);
        System.out.println(myNum + " ");

        haveYouMet("Ted");

        String str = reverse("eerT");
        System.out.println(str);

    }

    // Methods

    // method with not parameters
    public static void sayHi() {
        String name = "Sarah";
        System.out.println("Hi " + name);
    }

    // the arguments that the method takes are specified in the brackets after
    // the method's name. Within the method, we can use them like regular variables.
    public static void multiplyIt(int number) {
        System.out.println(number * 2);
    }

    // How many arguments can we throw into a single method?
    // We can define as many parameters as we want, but we'll have to provide
    // values (arguments) for each parameter upon calling the method. 
    // remember, methods can also be defined with not parameters at all.
    public static void sayHello(String p1, String p2) {
        String s = "Hi " + p1 + "! Hi " + p2 + "!";
        System.out.println(s);
    }

    // we can return values from a method, but we have to specify it return type when defining the method.
    public static int doubleIt(int number) {
        int result = number * 2;
        return result;
    }

    // How many values can be returned?
    // Here's the catch: there can't be more than one return value.
    // However, we can use an array if you want to return more than one value of the same type
    int[] doubleIt(int... numbers) {
        int l = numbers.length;
        for (int i = 0; i < l; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    // We can also pass an array to our method.
    public static void printArray(String[] crew) {
        String output = "";

        for (String c : crew) {
            output += "Hi " + c + "! ";
        }
        System.out.println(output);
    }

    // Similarly, a variable number of arguments can handy.
    public static int sumUp(int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        return result;
    }

    // Calling a method within a method? Some would say that's "Inception".
    public static int addFive(int number) {
        return number + 5;
    }

    public static void process(int[] numbers) {
        for (int n : numbers) {
            n = addFive(n); // invoking addFive()
            System.out.println(n + " ");
        }
    }

    // Note that a method doesn't change the value of the passed variable as argument
    public static void plusFive(int number) {
        number += 5;
        System.out.println(number);
    }

    // Why all this fuss about arguments in a method?
    // Because we can use arguments to make a method fit for more than just
    // one situation. After all, reusing code is what methods are for!
    public static void haveYouMet(String name) {
        String str = "Have you met " + name + "?";
        System.out.println(str);
    }

    // reverse string
    public static String reverse(String a) {
        String result = "";
        int l = a.length();

        for (int i = 0; i < l; i++) {
            result = a.charAt(i) + result;
        }
        return result;
    }

}
