import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many coin tosses do you need?");
        int number = scanner.nextInt();
        
        System.out.println("Now I will toss the coin " + number + " times.");

        int heads = 0;
        int tails = 0;

        for(int i = 0; i < number; i++) {
            String result = (Math.random() < 0.5) ? "tails" : "heads";
            System.out.println("Toss: " + result);

            if (result.equals("heads")) {
                heads++;
            } else  {
                tails++;
            }
        }
        System.out.println("Heads facing up: " + heads);
        System.out.println("Tails facing up: " + tails);

        scanner.close();
    }
}
