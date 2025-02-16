import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 101);
        int guess;
        int guesses = 0;
        boolean guessed = false;

        System.out.println("Guess a number between 0 and 100");

        while (!guessed) {
            System.out.println("Enter your guess: " );
            guess = scanner.nextInt();
            guesses++;

            if (guess == random) {
                System.out.println("Yes, the number is " + guess);
                guessed = true;

                System.out.println("You guessed the correct number in " + guesses + " guesses");

            } else if (guess < random)  {
                System.out.println("Your guess is too low");
            } else  {
                System.out.println("Your guess is too high");
                }  
            }
            scanner.close();
        }
    }
