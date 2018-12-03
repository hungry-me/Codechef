package beginner;
import java.util.Scanner;
public class TanuAndHeadBob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int ar[]={0,0,0};
            int n=sc.nextInt();
            String s=sc.next();
            for (int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='N')
                    ar[0]++;
                else if(s.charAt(j)=='Y')
                    ar[1]++;
                else
                    ar[2]++;
            }
            if(ar[2]!=0)
                System.out.println("INDIAN");
            else if(ar[1]!=0)
                System.out.println("NOT INDIAN");
            else
                System.out.println("NOT SURE");
        }
    }
}
