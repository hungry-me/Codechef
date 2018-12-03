package beginner;
import java.util.Scanner;
import java.util.ArrayList;

public class SimilarDishes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int cn=0;
            ArrayList<String> l=new ArrayList<>();
            for (int j=0;j<4;j++)
                l.add(sc.next());
            for (int j=0;j<4;j++){
                if(l.contains(sc.next()))
                    cn++;
            }
            if(cn>=2)
                System.out.println("similar");
            else
                System.out.println("dissimilar");
        }
    }
}
