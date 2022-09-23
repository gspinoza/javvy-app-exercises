package gspinoza;

public class IfElseStatements {
    
    public static void main(String[] args) {
        // if clause - checking boolean condition in if clause
        int six = 6;
        boolean myboolean = six == 6;
        if (myboolean) {
            System.out.println("true");
        }

        // if and else clause - if boolean is false, the else clause code gets executed 
        boolean mybool = 5 > 6;
        if (mybool)  {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // boolean condition withing the if clause
        int ten = 10;
        if (ten > 5) {
            System.out.println("true");
        }

        // conditions with if, else if, else
        int seven = 200;

        if (seven == 7) {
            System.out.println("Same to 7");
        } else if (seven == 8) {
            System.out.println("Same to 8");
        } else if (seven == 9) {
            System.out.println("same to 9");
        } else {
            System.out.println("is not 7, 8, or 9");
        }

        // nested if statements
        int x = -3;
        if (x < 5) {
            if (x > -5) { // -5.....x...x.....5
                System.out.println("x is less than 5 and greater than -5");
            }
        }
    }
}
