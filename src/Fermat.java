/**
 * @author Artiom Divak
 */
import java.util.*;

public class Fermat {
    public static int power(int num, int pow){
        int sum = 1;
        for(int i=0;i<pow;i++){
            sum = sum*num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input:");
        int n = sc.nextInt();
        int range = sc.nextInt();
        int not_found = 0;
        for(int i = 1; i < range ;i++){
            for(int j = i; j < range ;j++){
                for(int k = j; k < range ;k++){
                    if(power(i,n) + power(j,n) == power(k,n)){
                        not_found++;
                        System.out.println(i+","+j+","+k);
                    }
                }
            }
        }
        if (not_found==0){
            System.out.println("no");
        }
    }
}
