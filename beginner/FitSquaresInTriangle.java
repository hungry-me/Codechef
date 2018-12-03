package beginner;
import java.util.Scanner;
public class FitSquaresInTriangle {
    public static int count(int n){
        int cn=0;
        while (n>2){
            cn+=(n-2)/2;
            n=n-2;
        }
        return cn;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=scanner.nextInt();
            System.out.println(count(n));
        }
    }
}
