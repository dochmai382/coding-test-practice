import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); // PI * r^2
        double result = 2 * Math.sqrt(Math.PI * a);
        System.out.printf("%.10f\n", result);
        
    }
}

/*
a = PI * r^2
r = sqrt(pi/a)
2pi*r = 2 * sqrt(pi * a)
*/