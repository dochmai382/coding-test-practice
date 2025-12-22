import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            br.readLine();
            
            BigInteger A = new BigInteger(br.readLine());
            BigInteger B = new BigInteger(br.readLine());

            bw.write(String.valueOf(A.multiply(B)));
        }
    }
}