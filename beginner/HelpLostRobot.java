package beginner;
import java.util.Scanner;
public class HelpLostRobot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
            if(x2==x1 && y2>y1)
                System.out.println("up");
            else if(x2==x1 && y2<y1)
                System.out.println("down");
            else if(y2==y1 && x2>x1)
                System.out.println("right");
            else if(y2==y1 && x2<x1)
                System.out.println("left");
            else
                System.out.println("sad");
        }
    }
}
