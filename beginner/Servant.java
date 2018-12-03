package beginner;

import java.util.Scanner;
public class Servant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            if (n<10)
                System.out.println("What an obedient servant you are!");
            else
                System.out.println("-1");
        }
    }
}
