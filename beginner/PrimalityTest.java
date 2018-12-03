package beginner;
import java.util.Scanner;
public class PrimalityTest {
    public static void prime(int n){
        boolean fl=false;
        for (int i=2;i<(int)Math.sqrt(n);i++){
            if(n%i==0)
            {
                fl=true;
                break;
            }
        }
        if(!fl)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            prime(n);
        }
    }
}
