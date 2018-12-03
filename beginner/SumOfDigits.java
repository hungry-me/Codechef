package beginner;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int x,sm=0;
            while (n!=0){
                x=n%10;
                sm+=x;
                n/=10;
            }
            System.out.println(sm);
        }
    }
}
