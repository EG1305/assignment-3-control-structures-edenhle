import java.util.Scanner;

public class FindPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will iteratively find digits of PI using the Leibniz formula");
        System.out.println("How many iterations should we use? Please enter an integer");
        int iterations = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        double pi = calculatePi(iterations);
        long endTime = System.currentTimeMillis();
    }
}
