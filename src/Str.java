/**
 * @author Artiom Divak
 */
import java.util.*;

public class Str {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input:");
        String userInput = sc.nextLine();
        String[] parts = userInput.split(",");
        if(parts.length != 2){
            System.out.println("Invalid input");
            return;
        }
        String findStr = parts[0];
        String sentence = parts[1];
        parts = sentence.split("_");
        System.out.print("Output:");
        for(int i =0; i < parts.length; i++){
            if(parts[i].contains(findStr)){
                System.out.println(parts[i]);
            }
        }


    }
}
