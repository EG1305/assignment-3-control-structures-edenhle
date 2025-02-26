public class MultiplesOfTen {
    public static void main(String[] args) {
        int count = 0;

         for (int number = 10; number <= 1000; number += 10) {
            System.out.print(" " + number);
            count++;

            if (count % 10 == 0)    {
                System.out.println();
            }
         }
    }
    
}
