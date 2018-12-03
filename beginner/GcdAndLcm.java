package beginner;
import java.util.Scanner;
public class GcdAndLcm {
    public static long getGcd(long a,long b){
        if(a==0)
            return b;
        return getGcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            long a=sc.nextLong(),b=sc.nextLong();
            long g=getGcd(a,b);
            long lc=a*b/g;
            System.out.println(g+" "+lc);
        }
    }
}
