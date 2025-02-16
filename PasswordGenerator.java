import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many digits do you want to use for a numeric password?");
        int length = scanner.nextInt();

        String password = generatePassword(length);
        System.out.println("Your password is " + password);

        scanner.close();
    }
    static String generatePassword(int length)  {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++)    {
            int digit = random.nextInt(10);
            password.append(digit);
        }
        return password.toString();
    }
}

