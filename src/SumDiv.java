/**
 * @author 319339198
 */
public class SumDiv {
    /**
     * receives 3 positive Integers 'a,b,c' as arguments and prints
     * out the numbers between 1 and 'a' (including “a” itself)
     * that is divisible by b or c.
     *
     * @param args - contains 3 numbers
     */
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid input");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int sum = 0;
        if (a < 1 || b < 1 || c < 1) {
            System.out.println("Invalid input");
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
