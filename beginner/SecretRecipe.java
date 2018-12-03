package beginner;
import java.util.Scanner;
public class SecretRecipe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int x1=sc.nextInt(),x2=sc.nextInt(),x3=sc.nextInt(),v1=sc.nextInt(),v2=sc.nextInt();
            float x13=(float) Math.abs(x1-x3),x23=(float) Math.abs(x2-x3);
            float t1=x13/v1,t2=x23/v2;
            if(t1<t2)
                System.out.println("Chef");
            else if(t1>t2)
                System.out.println("Kefa");
            else
                System.out.println("Draw");
        }
    }
}
