package beginner;
import java.util.Scanner;
public class KitchenTimetable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt(),cn=0;
            int a[]=new int[n],b[]=new int[n];
            a[0]=sc.nextInt();
            int prev=a[0];
            for (int j=1;j<n;j++) {
                a[j]=sc.nextInt();
                int tp=a[j];
                a[j]-=prev;
                prev=tp;
            }
            for (int j=0;j<n;j++){
                b[j]=sc.nextInt();
                if(a[j]>=b[j])
                    cn++;
            }
            System.out.println(cn);
        }
    }
}
