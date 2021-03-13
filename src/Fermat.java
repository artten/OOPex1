/**
 * @author 319339198
 */

public class Fermat {
    /**
     * @param args - contains 2 numbers
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }
        int n = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);
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
