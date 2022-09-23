package gspinoza;

import java.util.Arrays; // import array library, it allows us to use methods from the class Arrays

public class JavaArrays {

    public static void main(String[] args) {

        // array declaration and initialization
        String[] words = {"Nature", "Animals", "Planets", "Universe"};
            
        // accessing element 4, remember arrays are zero-based.
        System.out.print(words[3]);    
                
        // creating a new variable, which holds element 1
        String favoriteword = words[0];
        System.out.println(favoriteword);

        // converting the entire array into a string
        String allwords = Arrays.toString(words);
        System.out.println(allwords);

        // printing converted string directly without making a variable.
        System.out.println(Arrays.toString(words));

        // determine the size or length (number of elements inside array) 
        System.out.println(words.length);

        // modifying the value of an element in the array
        words[1] = "Atoms";
        System.out.println(Arrays.toString(words));

        // array declaration and initialization
        int[] numbers = {1,2,3};

        // accessing element 2
        System.out.println(numbers[1]);
    }

    
}
