package beginner;
import java.util.Scanner;
public class IdAndShip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            char ch=sc.next().charAt(0);
            switch (ch){
                case 'b':
                case 'B':
                    System.out.println("BattleShip");
                    break;
                case 'C':
                case 'c':
                    System.out.println("Cruiser");
                    break;
                case 'D':
                case 'd':
                    System.out.println("Destroyer");
                    break;
                case 'f':
                case 'F':
                    System.out.println("Frigate");
            }
        }
    }
}
