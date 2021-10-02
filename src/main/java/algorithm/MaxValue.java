package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxValue {
    public void max3() {
        System.out.println("put 3 numbers then returns you max3 num");
        //領域拡張はオーバヘッドの原因のためサイズ指定が望ましい
        List<String>list = new ArrayList<String>(3);
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("max num is: " + generate(list));
    }

    public void max4() {
        System.out.println("put 4 numbers then returns you max num");
        //領域拡張はオーバヘッドの原因のためサイズ指定が望ましい
        List<String>list = new ArrayList<String>(4);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println("max num is: " + generate(list));
    }

    private int generate(List<String> names) {
        int max = 0;
        Scanner stdIn = new Scanner(System.in);
        for (String name: names) {
            System.out.println("num " + name + ":"); int input = stdIn.nextInt();
            if (max < input) max = input;
        };
        return max;
    }
}