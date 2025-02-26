import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user input
        System.out.println("Enter a number. The System will find all prime numbers smaller than this number.");
        int number = scanner.nextInt();

        int count = 0;  //counter for amount of prime numbers

        //conditions for prime numbers
        for (int i = 2; i < number; i++)    {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++)    {
                if (i % j == 0)    {
                    isPrime = false;
                    break;
                }
            }
            //if conditions for prime number is met
            if (isPrime)    {
                //prints prime numbers below user input
                System.out.println(i);
                count++;    //counts prime numbers
            }
        }
        //prints amount of prime numbers
        System.out.println("There are a total of " + count + " prime numbers.");
        scanner.close();
    }
}
