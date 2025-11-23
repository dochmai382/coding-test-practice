import java.util.Scanner;

public class Main {

    /* Given a value and a checkbit, return "true" if the check bit matches
     * up with the "value", and "false" otherwise. */
    private static boolean solveErrorDetection(int value, int checkbit) {
        boolean valid = false;

        /* ------------------- INSERT CODE HERE ---------------------*/
        int count = 0;
        while (value > 0) {
            count += value % 2;
            value /= 2;
        }

        valid = (count % 2 == checkbit);
        /* -------------------- END OF INSERTION --------------------*/

        return valid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++) 
        {

            int value = sc.nextInt();

            int checkbit = sc.nextInt();

            if (solveErrorDetection(value, checkbit)) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Corrupt");
            }
        }
    }
}
