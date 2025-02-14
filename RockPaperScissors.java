import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] choices = {"scissors", "rock", "paper"};

        System.out.println("Enter 0, 1, or 2");
        System.out.println("scissors (0), rock (1), paper (2): ");
        int human = input.nextInt();

        int computer = (int) (Math.random() * 3);

        if (human == computer)  {
            System.out.println("It's a tie!");
        }   else if ((human == 0 && computer == 2) ||
                     (human == 1 && computer == 0) ||
                     (human == 2 && computer == 1)) {
                System.out.println("You won! " + choices[human] + " beats " + choices[computer]);
            } else {
                System.out.println("You lose! " + choices[computer] + " beats " + choices[human]);
            }

            input.close();
    }
}
