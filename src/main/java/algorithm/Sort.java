package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public void outReverseList() {
        Scanner stdIn = new Scanner(System.in);
        int [] list = {3,4,5,2,2,7,8};

        for (int i = 0; i < Math.floorDiv(list.length, 2); i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }

        System.out.println("sorted:" + Arrays.toString(list));
    }
}
