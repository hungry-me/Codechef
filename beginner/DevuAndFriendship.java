package beginner;
import java.util.Scanner;
import java.util.HashSet;
public class DevuAndFriendship {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=0;k<t;k++){
            int n=sc.nextInt();
            HashSet<Integer> hs=new HashSet<Integer>();
            for (int i=0;i<n;i++)
                hs.add(sc.nextInt());
            System.out.println(hs.size());
        }
    }
}
