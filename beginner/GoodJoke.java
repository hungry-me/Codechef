package beginner;
import java.util.Scanner;
public class GoodJoke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            for (int j=0;j<n;j++) {
                int a = sc.nextInt(), b = sc.nextInt();
            }
            int x=1;
            for (int j=2;j<=n;j++)
                x=x^j;
            System.out.println(x);
        }
    }
}
