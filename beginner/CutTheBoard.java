package beginner;

import java.util.Scanner;
public class CutTheBoard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt(),m=sc.nextInt();
            System.out.println((n-1)*(m-1));
        }
    }
}
