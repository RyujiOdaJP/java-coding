package algorithm;

public class Sum {
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
