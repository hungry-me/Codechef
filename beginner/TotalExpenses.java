package beginner;
import java.util.Scanner;
public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int q=sc.nextInt();
            int p=sc.nextInt();
            System.out.printf("%.6f\n",q>1000?q*p-q*p*0.1:(double)q*p);
        }
    }
}
