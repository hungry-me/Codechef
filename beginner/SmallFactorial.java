package beginner;
import java.util.Scanner;
import java.math.BigInteger;
public class SmallFactorial{
    public static String factorial(int n){
        BigInteger f=new BigInteger("1");
        for (int i=n;i>1;i--)
            f=f.multiply(new BigInteger(""+i));
        String res=f.toString();
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            String res=factorial(n);
            System.out.println(res);
        }
    }
}
