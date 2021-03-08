/*
 * @author 319339198
 */

public class Fermat {
    public static int power(int num, int pow){
        int sum = 1;
        for(int i=0;i<pow;i++){
            sum = sum*num;
        }
        return sum;
    }
    public static void main(String[] args) {
        if(args.length != 2){
            return;
        }
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Input:");
        int n = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);
        int notFound = 0;
        for(int i = 1; i < range ;i++){
            for(int j = i; j < range ;j++){
                for(int k = j; k < range ;k++){
                    if(power(i,n) + power(j,n) == power(k,n)){
                        notFound++;
                        System.out.println(i+","+j+","+k);
                    }
                }
            }
        }
        if (notFound==0){
            System.out.println("no");
        }
    }
}
