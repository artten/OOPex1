/*
 * @author Artiom Divak
 */

public class SumDiv {
    public static void main(String[] args) {
        if(args.length != 3){
            return;
        }
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Input:");
        int a =Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
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
