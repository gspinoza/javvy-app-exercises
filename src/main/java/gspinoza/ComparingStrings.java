package gspinoza;

public class ComparingStrings {
    // suppress warnings for when using null
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // find length of a string
        String myStri = "Programming";
        int length = myStri.length();
        System.out.println(myStri + " has " + length + " characters.");

        // check if string is empty by checking its length
        String String1 = "";
        if (String1.length() == 0)
            System.out.println("It's Empty!");

        // combinings strings and chars
        char myChar = 'a';
        String myString2 = "b";
        System.out.println(myChar + myString2);

        // comparing strings using ".equals()" (compares the actual content of the object)
        String a = "Orange";
        String b = "Apple";
        boolean myboolean = a.equals(b);
        System.out.println(myboolean);

        // comparing strings using "==" (compares the reference values and objects)
        String c = "Animal";
        String d = "Animal";
        System.out.println(c == d);

        // checking if a string is null
        String s = null;
        String x = "Apple";
        if (s == null) {
            System.out.println("Do not execute else clause, as it will cause a NullPointerException!");
        } else {
            System.out.println(s.equals(x));
        }

        // check if string is empty
        String myString = "Tundra";

        if (myString != null) {
            System.out.println("string has a value");
        } else { 
            System.out.println("string is empty");
        }

        // Joining elements of char array into a single string
        char[] myCha = { 'a', 'b', 'c' };
        String q = new String(myCha);
        System.out.println(q);

        // string prefix .starsWith(), check if a string stars with a specific char
        String teacher = "Mrs. Samantha";

        if (teacher.startsWith("Mrs.")) {
            String female = "Hello ma'am";
            System.out.println(female);
        } else if (teacher.startsWith("Mr.")) {
            String male = "Hello sir!";
            System.out.println(male);
        }

        // string suffix .endsWith(), check if string ends with a specific char
        String student = "Gabriel";

        if (student.endsWith("a")) {
            String output = "Hello ma'am!";
            System.out.println(output);
        } else {
            String output = "Hello sir!";
            System.out.println(output);
        }

    }

}