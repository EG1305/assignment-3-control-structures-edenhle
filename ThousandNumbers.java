public class ThousandNumbers {
    public static void main(String[] args) {
        int count = 1;
        int line = 0;

        while (count <= 1000)  {
            System.out.println(+ count);
            line++;

            if (line % 10 == 0)    {
                System.out.println(" ");
            }

            count++;
        }
    }
}
