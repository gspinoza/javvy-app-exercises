package gspinoza;

public class BooleanAndLogicalOperators {

    public static void main(String[] args) {
        //BOOLEAN - A boolean can only be (True) or (False), and it will always tell you the truth.

        //LOGICAL OPERATORS
        // && - Logical AND -->> True if both booleans are true.
        // || - Logical OR  -->> True if one boolean is true. 
        // ! - Logical NOT  -->> Reverses the truth or false of a boolean.


        // >   - Greater than
        // <   - Less than
        // >=  - Greater than or Equal to
        // <=  - Less than or Equal to
        // ==  - Equal (remember "=" is only used to assign variables.)
        // !=  - Is not equal to 


        // checking if 9 is grater than 11.
        boolean myboolean = 9 > 22;
        System.out.println(myboolean);

        // checking if 5 is greater than or equal to 5
        boolean boo = 5 >= 5;
        System.out.println(boo);

        // checking if mynumber is greater than or equal to 7.
        int mynumber = 8;
        boolean mybool = mynumber >= 7;
        System.out.println(mybool);

        // LOGICAL && - AND -->> True if both booleans are true.
        boolean b1 = 1 < 2;
        boolean b2 = 7 >= 7;
        System.out.println(b1 && b2);

        // LOGICAL || - OR -->> True if one boolean is true. 
        boolean bo1 = 10 > 5;
        boolean bo2 = 8 < 9;
        System.out.println(bo1 || bo2);

        // LOGICAL ! - NOT -->> Reverses the truth or false of a boolean.
        boolean bool = 5 < 10;
        System.out.println(!bool);

        // NUlL - null stand for no value and it can be assigned just like a value, but only to strings.
        String x = null;
        System.out.println(x);

    }
}
