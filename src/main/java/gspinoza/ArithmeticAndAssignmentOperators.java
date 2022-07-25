package gspinoza;

public class ArithmeticAndAssignmentOperators {
    
    public static void main(String[] args) {
		
        // Arithmetic Operations using (+,-,*,/)
        int first = 50;
		int second = 10;
        System.out.println("50 + 10 = " + (first + second)); // adding
		System.out.println("50 - 10 = " + (first - second)); // subtracting
		System.out.println("50 * 10 = " + (first * second)); // multiplying
		System.out.println("50 / 10 = " + (first / second)); // dividing

        // storing results in a variable
        int result = first + second;
        System.out.println("50 + 10 = " + result);
		
        // combining strings with + operator
		String FirstName = "Gabriel ";
		String LastName = "Espinoza";
		System.out.println(FirstName + LastName);
		
		// Arithmetic Operations using Assignment Operators (+=, -=, *=, /=)

		int A = 5;
		int B = 2;
		System.out.println(A += B);   //same as A = A + B    note: result is stored in variable A
		System.out.println(A + B);    //Last result was A=7 so A+B equals 9.
		
        // adding
		int year = 2000;
		year += 22;
		System.out.println(year);
		
		// subtracting
		int money = 500; 
		money -= 400;
		System.out.println(money);

		// multiplying
		int numberA = 10; 
		numberA *= 5;
		System.out.println(numberA);

		// dividing
		int numberB = 100; 
		numberB /= 5;
		System.out.println(numberB);
		
		// combining strings with += operator
		String Ecosystem = "Tundra - ";
		String Animal = "Artic Fox";
		System.out.println(Ecosystem += Animal);

        // combining strings using concat()
		String m = "I want to master ";
		String j = m.concat("Java!");
		System.out.println(j);

        // increasing by 1
		int birthyear = 1993;
		birthyear++;
		System.out.println(birthyear);

        // decreasing by 1
		int CurrentYear = 2016;
		CurrentYear--;
		System.out.println(CurrentYear);

    }
    
}
