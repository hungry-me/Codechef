package beginner;
import java.util.Scanner;
public class LuckyFour {
    public  static long count(long n){
        long cn=0,x;
        while(n!=0){
            x=n%10;
            if(x==4)
                cn++;
            n/=10;
        }
        return cn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            long n=sc.nextLong();
            System.out.println(count(n));
        }
    }
}
