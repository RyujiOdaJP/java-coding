package algorithm;

import java.util.*;

public class CenterValue {
    Scanner stdIn = new Scanner(System.in);

    public int mid() {
        System.out.println("add length: ");
        List<Integer> inputs = new ArrayList<>();
        int length = stdIn.nextInt();
        int midIndex = Math.floorDiv(length, 2);

        for (int i = 0; i < length; i++) {
            System.out.println("add num of index of " + i);
            inputs.add(stdIn.nextInt());
        }
        Collections.sort(inputs);
        System.out.println(inputs);
        System.out.println("index" + midIndex);
        return inputs.get(midIndex);
    }
}
