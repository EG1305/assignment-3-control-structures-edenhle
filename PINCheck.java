import java.util.Scanner;

public class PINCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //user input PIN
        System.out.println("please enter your PIN");
        String pin = scanner.nextLine();
        String enteredPin;

        do{
            //re enter PIN
            System.out.println("Please confirm your PIN");
            enteredPin = scanner.nextLine();

            //if confirmed PIN is not equal to PIN, try again
            if  (!pin.equals(enteredPin))   {
                System.out.println("Incorrect PIN. Try again");
            }
        }   while   (!pin.equals(enteredPin));

        System.out.println("PIN accepted. You can access your account");
        scanner.close();
    }
}
