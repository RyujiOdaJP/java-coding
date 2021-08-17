

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        IStockAnalysisService analysisService = new VerySimpleStockTraderImpl.StockAnalysisServiceImpl();
        IOnlineBrokerageService brokerageService = new VerySimpleStockTraderImpl.NewYorkStockExchangeBrokerageServiceImpl();

        IAutomatedStockTrader stockTrader = new VerySimpleStockTraderImpl(
                analysisService,
                brokerageService
        );

        stockTrader.executeTrades();

        //System.out.println(sum(5));
        //System.out.println(pairSumSequence(5));

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list1.add(i);
            list2.add(i * 2);
        }

        sumExecutionTime(list1, list2);
        manipulateExecutionTime(list1, list2);

        long startTime = System.currentTimeMillis();
        twoRecursionCalc(10);
        long endTime = System.currentTimeMillis();
        execTimePrint(startTime, endTime);

        foo(list1);

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

    // 足すべきか掛けるべきか
    private static void sumExecutionTime(List<Integer> list1, List<Integer> list2) {
        // O(2N)
        // 処理前の時刻を取得
        long startTime = System.currentTimeMillis();

        list1.forEach(item -> System.out.println(item.toString()));
        list2.forEach(item -> System.out.println(item.toString()));
        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
        execTimePrint(startTime, endTime);
    }

    private static void manipulateExecutionTime(List<Integer> list1, List<Integer> list2) {
        // O(N^2)
        // 処理前の時刻を取得
        long startTime = System.currentTimeMillis();
        list1.forEach(item1 ->
                list2.forEach(item2 -> System.out.println(item1.toString() + " " + item2.toString()))
        );
        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
        execTimePrint(startTime, endTime);
    }

    private static int twoRecursionCalc(int n) {
        // O(2^N)の計算。 O(N^2)ではない！！
        long startTime = System.currentTimeMillis();

        if (n <= 1) {
            return 1;
        }
        return twoRecursionCalc(n - 1) + twoRecursionCalc(n - 1);
    }

    // これはO(N)
    private static void foo(List<Integer> array) {
        int sum = 0;
        int product = 1;

        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < array.length; i++)と同じ
        for (int j : array) {
            sum += j;
        }
//        for (int i = 0; i < array.length; i++)と同じ
        for (int j : array) {
            product *= j;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(sum + "," + product);
        execTimePrint(startTime, endTime);
    }

    // 平衡二分木
    // N個Nodeがあれば深さはlogN 計算時間はO(2^log2N) -> O(N)
    static int sumBinary(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return sumBinary(node.left) + node.value + sumBinary(node.right);
    }

    // 素数かどうかの判断ロジック O(√N)
    static boolean isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) return false;
        }
        return true;
    }

    private static void execTimePrint(long startTime, long endTime) {
        System.out.println("開始時刻：" + startTime + " ms");
        System.out.println("終了時刻：" + endTime + " ms");
        System.out.println("処理時間：" + (endTime - startTime) + " m\n");
    }
}
