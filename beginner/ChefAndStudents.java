package beginner;
import java.util.Scanner;
public class ChefAndStudents {
    public static int getCount(String s){
        char c[]=s.toCharArray();
        for (int i=0;i<c.length;i++){
            if(c[i]=='<')
                c[i]='>';
            else if(c[i]=='>')
                c[i]='<';
        }
        int cn=0;
        for (int i=0;i<s.length()-1;i++){
            if(c[i]=='>' && c[i+1]=='<')
                cn++;
        }
        return cn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s=sc.next();
            int res=getCount(s);
            System.out.println(res);
        }
    }
}
