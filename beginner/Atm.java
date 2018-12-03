package beginner;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        float y=sc.nextFloat();
        float res=(y-x)-0.5f;
        if(res>=0 && x%5==0)
        {
            System.out.printf("%.2f",res);
        }
        else
            System.out.printf("%.2f",res);
    }
}
