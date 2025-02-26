import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lastGuess = 1;   //initial guess
        double nextGuess;
        double difference = Double.MAX_VALUE;   //nextGuess-lastGuess
        int iterations = 0; //call iterations counter

        //user input integer
        System.out.println("The program will find the square root of a number");
        System.out.println("Enter a positive integer");
        int n = scanner.nextInt();

        while (difference >= 0.000001) {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            difference = Math.abs(nextGuess - lastGuess);
            lastGuess = nextGuess;
            iterations++;   //counting interations
        }

        //display outputs of n, lastGuess, and iterations
        System.out.println("The square root of " + n + " is " + lastGuess);
        System.out.println("The program found the result in " + iterations + " iterations");

        scanner.close();
    }
}