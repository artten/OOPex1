/**
 * @author 319339198
 */
public class Str {
    static final String UNDER_SCORE = "_";
    /**
     * which receives two strings as arguments: query and sequence
     *
     * The sequence is a list of words separated by “_” and the query is any string.
     *
     * The program should print two groups of words:
     *
     * The words in the sequence that start with the query (case sensitive)
     * All words in the sequence that include the query (case sensitive)
     * Each group of words should be printed in the order they appear in the original sequence.
     * If the input is not valid, the program should print out: Invalid input
     *
     * @param args - contains sentence and query
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid input");
            return;
        }
        String findStr = args[0];
        String sentence = args[1];
        String[] parts = sentence.split(UNDER_SCORE);
        for (String word: parts) {
            if (word.startsWith(findStr)) {
                System.out.println(word);
            }
        }
        for (String word: parts) {
            if (word.contains(findStr) && !word.startsWith(findStr)) {
                System.out.println(word);
            }
        }



    }
}
