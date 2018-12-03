package beginner;
import java.util.Scanner;
import java.math.BigInteger;
public class LazyJem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            long n=sc.nextLong(),b=sc.nextLong(),m=sc.nextLong();
            long p=1;
            BigInteger res=new BigInteger("0");
            while (n!=0){
                long done;
                if(n%2==0)
                    done=n/2;
                else
                    done=(n+1)/2;
                n-=done;
                res=res.add(BigInteger.valueOf(done*m));
                res=res.add(BigInteger.valueOf(b));
                m=2*m;
            }
            System.out.println(res.subtract(BigInteger.valueOf(b)));
        }
    }
}
