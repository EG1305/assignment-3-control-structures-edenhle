import java.util.Scanner;

public class PINCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your PIN");
        String pin = scanner.nextLine();
        String enteredPin;

        do{
            System.out.println("Please confirm your PIN");
            enteredPin = scanner.nextLine();
            if  (!pin.equals(enteredPin))   {
                System.out.println("Incorrect PIN. Try again");
            }
        }   while   (!pin.equals(enteredPin));

        System.out.println("PIN accepted. You can access your account");
        scanner.close();
    }
}
