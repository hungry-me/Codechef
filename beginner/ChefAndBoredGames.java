package beginner;
import java.util.Scanner;
public class ChefAndBoredGames {
    public static long count(int n){
        long res=0;
        for (int i=n;i>0;i-=2)
            res+=(long)Math.pow(i,2);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            long res=count(n);
            System.out.println(res);
        }
    }
}
