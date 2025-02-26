import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will tell you if the number you enter is prime or not");
        System.out.println("You can enter 0 anytime to stop the program");
        
        while (true)    {
            //user input
            System.out.println("Please enter a number");
            int number = scanner.nextInt();

            //0 is not prime, if 0 is entered, end the program
            if (number == 0)    {
                System.out.println("0 is not prime");
                break;
            }
            boolean isPrime = true;

            //conditions for prime numbers
            if (number <= 1)    {
                isPrime = false;    //1 is not a prime number
            } else  {
                for (int i = 2; i <= Math.sqrt(number); i++)    {
                    if (number % i == 0)    {
                        isPrime = false;
                        break;
                    }
                }
            }
            //if conditions for prime number is met, print "is prime", otherwise print "it is not prime"
            if (isPrime)    {
                System.out.println(number + " is prime");
            } else  {
                System.out.println(number + " is not prime");
            }
        }
        scanner.close();
    }
    
}
