package beginner;
import java.util.Scanner;
public class GradeTheSteel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            float h=sc.nextFloat(),c=sc.nextFloat(),t=sc.nextFloat();
            if(h>50 && c<0.7 && t>5600)
            {
                System.out.println("10");
                continue;
            }
            else if(h>50 && c<0.7)
            {
                System.out.println("9");
                continue;
            }
            else if(c<0.7 && t>5600)
            {
                System.out.println("8");
                continue;
            }
            else if(h>50 && t>5600){
                System.out.println("7");
                continue;
            }
            else if(h>50 || c<0.7 || t>5600) {
                System.out.println("6");
                continue;
            }
            else
                System.out.println("5");
        }
    }
}
