import java.util.Scanner;

public class Mersenne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user input limit
        System.out.println("Enter a number. The System will find all the Mersenne prime numbers smaller than this number.");
        int limit = scanner.nextInt();

        int count = 0;  //counter for amount of mersenne prime

        for (int n = 2; ; n++)    {
            int mersenne = (int) Math.pow(2, n) - 1; //Mersenne prime equation
            if (mersenne >= limit)  {
                break;  //stop program if mersenne is greater than limit
            }
            //conditions for prime numbers
            boolean isPrime = true;
            for (int i = 2; i * i <= mersenne; i++)    {
                if (mersenne % i == 0)    {
                    isPrime = false;
                    break;
                }
            }
            //if conditions for prime number is met
            if (isPrime)    {
                //prints mersenne prime numbers
                System.out.println(mersenne);
                count++;    //counts prime numbers
            }
        }
        System.out.println("There are a total of " + count + " Mersenne prime numbers");
        scanner.close();

    }
}
