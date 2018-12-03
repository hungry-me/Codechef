package beginner;
import java.util.Scanner;
public class ChefAndWildcard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String a=sc.next(),b=sc.next();
            boolean fl=true;
            for (int j=0;j<a.length();j++){
                char x=a.charAt(j),y=b.charAt(j);
                if(x=='?' || y=='?' || x==y)
                    continue;
                else {
                    fl=false;
                    break;
                }
            }
            if(fl)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
