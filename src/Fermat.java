/**
 * @author 319339198
 */

public class Fermat {
    /**
     * receives 2 positive Integers as arguments: n, range
     *
     * The program should print all “a,b,c” for which the Pythagorean
     * equation a^n + b^n = c^n is respected, s.t a, b and c are between
     * 1 and range (the second argument).
     *
     * If no Pythagorean equation is found, print "no"
     *
     * If the input has less than 2 values or if one of the values is not positive,
     * the program prints “Invalid input”.
     *
     * @param args - contains 2 numbers
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }
        int n = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);
        if (range < 1 || n < 1) {
            System.out.println("Invalid number");
            return;
        }
        int notFound = 0;
        for (int i = 1; i < range; i++) {
            for (int j = i; j < range; j++) {
                for (int k = j; k < range; k++) {
                    if (Math.pow(i, n) + Math.pow(j, n) == Math.pow(k, n)) {
                        notFound++;
                        System.out.println(i + "," + j + "," + k);
                    }
                }
            }
        }
        if (notFound == 0) {
            System.out.println("no");
        }
    }
}
