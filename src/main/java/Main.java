class Main {
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(pairSumSequence(5));
    }

    // O(N)の実行時間とO(N)のメモリ領域が必要
    // この関数の実行が終わるまで再帰的に呼ばれた関数がスタックするためO(N)のメモリを消費
    private static int sum(int num) {
        if (num <= 0) return 0;
        return num + sum(num - 1);
    }

    // O(N)の実行時間とO(1)のメモリ領域が必要
    private static int pairSumSequence(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    // コールスタック上に同時に存在することはないのでメモリはO(1)
    private static int pairSum(int num1, int num2) {
        return num1 + num2;
    }
}
