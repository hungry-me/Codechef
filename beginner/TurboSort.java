package beginner;
import java.util.Scanner;
import java.util.Arrays;
public class TurboSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        Arrays.sort(ar);
        for (int i=0;i<ar.length;i++)
            System.out.println(ar[i]);
    }
}
