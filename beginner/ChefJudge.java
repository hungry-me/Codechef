package beginner;
import java.util.Arrays;
import java.util.Scanner;
public class ChefJudge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int a[]=new int[n],b[]=new int[n];
            for (int j=0;j<n;j++)
                a[j]=sc.nextInt();
            for (int j=0;j<n;j++)
                b[j]=sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int sa=0,sb=0;
            for (int j=0;j<n-1;j++)
            {
                sa+=a[j];
                sb+=b[j];
            }
            if(sa<sb)
                System.out.println("Alice");
            else if(sa>sb)
                System.out.println("Bob");
            else
                System.out.println("Draw");
        }
    }
}
