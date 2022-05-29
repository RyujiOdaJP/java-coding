package algorithm;

import java.util.Scanner;

public class Sum {
    public void getTwoNumbersInput() {
        int num1;
        int num2;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("add two nums and returns you sum between them.");

        do {
            System.out.println("first num: ");
            num1 = stdIn.nextInt();
            if (num1 < 0) System.out.println("given num is invalid, it should be positive");
        } while (num1 < 0);

        do {
            System.out.println("second num: ");
            num2 = stdIn.nextInt();
            if (num2 < 0) System.out.println("given num is invalid, it should be positive");

        } while (num2 < 0);
        System.out.println("sum between num1 and num2 is: " + sumBetweenArgs(num1, num2));
    }
    public int sumBetweenArgs(int num1, int num2) {
        int diff = Math.abs(num1 - num2);
        int bigNum = Math.max(num1, num2);
        if (diff == 0) return num1 + num2;

        int sum = bigNum;
        for (int i = 1; i <= diff; i++) {
            sum += (bigNum - i);
        }
        return sum;
    }
}
