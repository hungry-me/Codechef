package beginner;
import java.util.Scanner;
import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int ar[]=new int[3];
            for (int j=0;j<3;j++)
                ar[j]=sc.nextInt();
            Arrays.sort(ar);
            System.out.println(ar[1]);
        }
    }
}
