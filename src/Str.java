/**
 * @author 319339198
 */
public class Str {
    public static void main(String[] args) {
        /**
         * @param args - contains sentence and query
         */
        if (args.length != 2) {
            System.out.println("Invalid input");
            return;
        }
        String findStr = args[0];
        String sentence = args[1];
        String[] parts = sentence.split("_");
        for (String word: parts) {
            if (word.contains(findStr)) {
                System.out.println(word);
            }
        }


    }
}
