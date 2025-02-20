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

        double elapsedTime = (endTime - startTime) / 1000.0;

        System.out.println("PI = " + pi);
        System.out.println("After " + iterations + " iterations.\nThis operation took " + elapsedTime + " seconds");

        scanner.close();
    }
    private static double calculatePi(int iterations)   {
        double pi = 0;
        double sign = 1;
        for (int i = 0; i < iterations; i++) {
            pi += sign * 4.0 / (2 * i + 1);
            sign *= -1;
        }
        return pi;
    }
}
