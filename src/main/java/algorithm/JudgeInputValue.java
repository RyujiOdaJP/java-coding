package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JudgeInputValue {
    public void max3() {
        System.out.println("put 3 numbers then returns you max3 num");
        //領域拡張はオーバヘッドの原因のためサイズ指定が望ましい
        List<String> list = new ArrayList<String>(3);
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("max num is: " + generate(list));
    }

    public void max4() {
        System.out.println("put 4 numbers then returns you max num");
        //領域拡張はオーバヘッドの原因のためサイズ指定が望ましい
        List<String> list = new ArrayList<String>(4);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println("max num is: " + generate(list));
    }

    public void min4() {
        System.out.println("put 4 numbers then returns you minimum num");
        //領域拡張はオーバヘッドの原因のためサイズ指定が望ましい
        List<String> list = new ArrayList<String>(4);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println("minimum num is: " + generate(list, true));
    }

    private int generate(List<String> names) {
        return generate(names, false);
    }

    private int generate(List<String> names, Boolean isMinNeeded) {
        Scanner stdIn = new Scanner(System.in);

        if (isMinNeeded) {
            int min = Integer.MAX_VALUE;
            for (String name : names) {
                System.out.println("num " + name + ":");
                int input = stdIn.nextInt();
                if (min > input) min = input;
            }
            return min;
        }

        int max = Integer.MIN_VALUE;

        for (String name : names) {
            System.out.println("num " + name + ":");
            int input = stdIn.nextInt();
            if (max < input) max = input;
        }
        return max;
    }
}