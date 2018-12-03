package beginner;
import java.util.Scanner;
public class PuppyAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int d=sc.nextInt(),n=sc.nextInt();
            int res=0;
            while(d!=0){
                res=n*(n+1)/2;
                n=res;
                d--;
            }
            System.out.println(res);
        }
    }
}
