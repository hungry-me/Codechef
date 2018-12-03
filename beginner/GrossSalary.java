package beginner;
import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int s=sc.nextInt();
            float res=0.0f;
            if(s<1500)
                res=s+(s*0.1f)+(s*0.9f);
            else
                res=s+500+(s*0.98f);
            System.out.printf("%.2f\n",(double)res);
        }
    }
}
