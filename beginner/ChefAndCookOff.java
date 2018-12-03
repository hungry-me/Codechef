package beginner;
import java.util.Scanner;
public class ChefAndCookOff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int ar[]=new int[5],cn=0;
            for (int j=0;j<5;j++){
                ar[j]=sc.nextInt();
                if(ar[j]==1)
                    cn++;
            }
            switch (cn){
                case 0:
                    System.out.println("Beginner");
                    break;
                case 1:
                    System.out.println("Junior Developer");
                    break;
                case 2:
                    System.out.println("Middle Developer");
                    break;
                case 3:
                    System.out.println("Senior Developer");
                    break;
                case 4:
                    System.out.println("Hacker");
                    break;
                case 5:
                    System.out.println("Jeff Dean");
            }
        }
    }
}
