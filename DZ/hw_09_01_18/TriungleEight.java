package hw_09_01_18;
public class TriungleEight {
    public static void main(String[] args) {
        final int NMAX = 10;
        int odds [][] = new int [NMAX+1][];
        for (int n = 0; n <= NMAX; n++)
        {
            odds [n] = new int [n+1];
        }

        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {
                odds[n][k] = 8;
            }
            for (int[] row: odds)
            {
                for (int odd: row)
                    System.out.printf("%4d", odd);
                System.out.println();

            }
    }
}
