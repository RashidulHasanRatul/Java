package BasicJava;

public class Array {
    public static void main(String[] args) {
        /*Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.*/

        // Declare Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        // Accessing Array
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        // Chnage Array Element
        cars2[1] = "Toyota";
        System.out.println(cars2[1]);
        // Array Length
        System.out.println(cars2.length);

        // Loop Throw Array Using For

        for (int i = 0; i < cars2.length; i++) {
            System.out.println(cars2[i]);
        }

        // Loop Throw Array Using ForEach

        for (String i : cars2) {
            System.out.println(i);
        }

        // Multi Dimensional Array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }



    }
}
