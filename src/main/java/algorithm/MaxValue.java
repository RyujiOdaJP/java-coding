package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxValue {
    public void max() {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("put 3 numbers then returns you max num");
        System.out.println("num a:"); int a = stdIn.nextInt();
        System.out.println("num b:"); int b = stdIn.nextInt();
        System.out.println("num c:"); int c = stdIn.nextInt();

        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        System.out.println("max num is: " + max);
    }
}