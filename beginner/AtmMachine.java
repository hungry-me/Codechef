package beginner;
import java.util.Scanner;
public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt(),k=sc.nextInt();
            String s="";
            int ar[]=new int[n];
            for (int j=0;j<n;j++)
                ar[j]=sc.nextInt();
            for (int j=0;j<n;j++)
            {
                if(k>=ar[j])
                {
                    s+="1";
                    k-=ar[j];
                }
                else
                    s+="0";
            }
            System.out.println(s);
        }
    }
}
