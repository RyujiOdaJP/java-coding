package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxValue {
    public int max() {
        Scanner stdIn = new Scanner(System.in);
        int max = stdIn.nextInt();
        if(max < stdIn.nextInt()) max = stdIn.nextInt();
        if(max < stdIn.nextInt()) max = stdIn.nextInt();
        return max;
    }
}