package beginner;

import java.util.Scanner;
public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String n=sc.next();
            int res=Integer.parseInt(String.valueOf(n.charAt(0)))+Integer.parseInt(String.valueOf(n.charAt(n.length()-1)));
            System.out.println(res);
        }
    }
}
