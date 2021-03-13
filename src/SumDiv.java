/**
 * @author 319339198
 */

public class SumDiv {
    public static void main(String[] args) {
        /**
         * @param args - contains 3 numbers
         */
        if (args.length != 3) {
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int sum = 0;
        if (a < 1 && b < 1 && c < 1 ) {
            return;
        }
        for (int i = 1; i <= a; i++) {
            if (i % b == 0 || i % c == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
