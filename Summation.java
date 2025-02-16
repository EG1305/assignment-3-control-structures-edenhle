import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("This program will add all the numbers you enter");
        System.out.println("Enter 0 for me to stop adding");

        while (true)    {
            number = scanner.nextInt();

            System.out.println("You entered " + number);

            if (number == 0)    {
                break;
            }
            sum += number;
            System.out.println("The sum is " + sum);
        }
        System.out.println("The sum of all numbers you entered is " + sum);

        scanner.close();
    }
}
    
 
