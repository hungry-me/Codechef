package beginner;
import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if((a+b+c)==180 && a!=0 && b!=0 && c!=0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
