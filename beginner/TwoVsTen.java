package beginner;
import java.util.Scanner;
public class TwoVsTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=n%10;
            if(x==0)
                System.out.println("0");
            else if(x==5)
                System.out.println("1");
            else
                System.out.println("-1");
        }
    }
}
