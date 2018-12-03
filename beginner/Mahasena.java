package beginner;
import java.util.Scanner;
public class Mahasena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ev=0,od=0;
        int ar[]=new int[n];
        for (int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            if(ar[i]%2==0)
                ev++;
            else
                od++;
        }
        if(ev>od)
            System.out.println("READY FOR BATTLE");
        else
            System.out.println("NOT READY");
    }
}
