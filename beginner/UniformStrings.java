package beginner;
import java.util.Scanner;
public class UniformStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s=sc.next();
            int cn=0;
            for (int j=0;j<s.length()-1;j++)
            {
                if(s.charAt(j)!=s.charAt(j+1))
                    cn++;
            }
            if(s.charAt(0)!=s.charAt(s.length()-1))
                cn++;
            if(cn<=2)
                System.out.println("uniform");
            else
                System.out.println("non-uniform");
        }
    }
}
