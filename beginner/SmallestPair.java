package beginner;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int ar[]=new int[n];
            for (int j=0;j<n;j++)
                ar[j]=sc.nextInt();
            Arrays.sort(ar);
            System.out.println(ar[0]+ar[1]);
        }
    }
}
