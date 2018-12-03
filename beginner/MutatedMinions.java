package beginner;

import java.util.Scanner;
public class MutatedMinions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt(),k=sc.nextInt();
            int ar[]=new int[n],cn=0;
            for (int j=0;j<n;j++){
                ar[j]=sc.nextInt()+k;
                if(ar[j]%7==0)
                    cn++;
            }
            System.out.println(cn);
        }
    }
}
