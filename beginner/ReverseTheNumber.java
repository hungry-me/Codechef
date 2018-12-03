package beginner;
import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt(),rev=0;
            while (n!=0){
                int x=n%10;
                rev=(rev*10)+x;
                n/=10;
            }
            System.out.println(rev);
        }
    }
}
