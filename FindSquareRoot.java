import java.util.Scanner;

public class FindSquareRoot {

    public static void main(String[] args) {
        //Scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Prompts user input
        System.out.println("The program will find the square root of a number");
        System.out.print("Enter a positive integer: \n");
        
        //Reads user input
        int n = scanner.nextInt();

        //Call to find the square root
        findSquareRoot(n);

        scanner.close();
    }

    public static void findSquareRoot(double n) {
        //input is positive/above 0
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Initial guess
        double lastGuess = 1.0;
        //Difference between nextGuess and lastGuess
        double difference = Double.MAX_VALUE;
        //Counter for iterations
        int iterations = 0;

        //Iterate until difference is less than the threshold
        while (difference >= 0.000001) {
            double nextGuess = (lastGuess + n / lastGuess) / 2;
            difference = Math.abs(nextGuess - lastGuess); // Difference between guesses
            lastGuess = nextGuess; // Update lastGuess
            iterations++; // Increment iteration counter
        }

        //Print result
        System.out.println("The square root of " + n + " is " + lastGuess);
        System.out.println("The program found the result in " + iterations + " iterations");

    }
}
