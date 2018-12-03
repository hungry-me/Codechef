package beginner;
import java.util.Scanner;
public class ChefAndSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int ar[]=new int[n];
            int cn=0;
            for (int j=0;j<n;j++)
                ar[j]=sc.nextInt();
            for (int j=0;j<n;j++){
                for (int k=j;k<n;k++) {
                    long sm = 0, pr = 1;
                    for (int x = j; x <= k; x++) {

                        sm += ar[x];
                        pr *= ar[x];
                    }
                    if(sm==pr)
                        cn++;
                }
            }
            System.out.println(cn);
        }
    }
}
