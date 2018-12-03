package beginner;
import java.util.Scanner;
public class MalavikaBallon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s=sc.next();
            int a=0,b=0;
            for (int j=0;j<s.length();j++){
                if(s.charAt(j)=='a')
                    a++;
                else
                    b++;
            }
            System.out.println((int)Math.min(a,b));
        }
    }
}
