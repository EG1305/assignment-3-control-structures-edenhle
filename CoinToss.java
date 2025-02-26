import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user input amount of coin tosses
        System.out.println("How many coin tosses do you need?");
        int number = scanner.nextInt();
        
        //print amount of times coin will be tossed
        System.out.println("Now I will toss the coin " + number + " times.");

        int heads = 0;  //counter for heads
        int tails = 0;  //counter for tails

        for(int i = 0; i < number; i++) {
            String result = (Math.random() < 0.5) ? "tails" : "heads";
            System.out.println("Toss: " + result);

            if (result.equals("heads")) {
                heads++;
            } else  {
                tails++;
            }
        }
        System.out.println("Heads facing up: " + heads); //print amount of times head is facing up
        System.out.println("Tails facing up: " + tails); //print amount of times tails is facing up

        scanner.close();
    }
}
