package beginner;
import java.util.Scanner;
public class BlockGame {
    public static boolean pallindrome(int n){
        int t=n,x,rev=0;
        while(n!=0){
            x=n%10;
            rev=(rev*10)+x;
            n/=10;
        }
        if(rev==t)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            if(pallindrome(n))
                System.out.println("wins");
            else
                System.out.println("losses");
        }
    }
}
