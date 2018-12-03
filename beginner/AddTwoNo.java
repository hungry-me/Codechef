package beginner;
import java.util.Scanner;
public class AddTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}
