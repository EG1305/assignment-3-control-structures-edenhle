import java.math.BigInteger;

public class RiceChessboard {
    public static void main(String[] args) {
        int squares = 64;
        BigInteger totalRice = BigInteger.ZERO;
        BigInteger lastSquare = BigInteger.ONE;

        for (int i = 1; i <= squares; i++)  {
            System.out.println(lastSquare + " rice on square " + i);
            totalRice = totalRice.add(lastSquare);
            lastSquare = lastSquare.multiply(BigInteger.valueOf(2));
        }
        System.out.println(totalRice + " rice on chessboard");
    }
}
