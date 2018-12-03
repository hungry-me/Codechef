package beginner;
import java.util.Scanner;
public class CoinAndTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt(),cn=0;
            for (int j=1;;j++){
                if(n<j)
                    break;
                n-=j;
                cn++;
            }
            System.out.println(cn);
        }
    }
}
