/*
 * @author Artiom Divak
 */
import java.util.*;
public class SumDiv {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        for(int i=1;i < a;i++){
            if(i%b==0 || i%c==0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
