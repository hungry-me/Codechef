package beginner;
import java.util.Scanner;
public class LeadGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sa=0,sb=0;
        int ar[]={-99999,-99999};
        for (int i=0;i<n;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            sa+=a;
            sb+=b;
            if(sa>sb){
                int res=sa-sb;
                if(res>ar[0])
                    ar[0]=res;
            }
            else
            {
                int res=sb-sa;
                if(res>ar[1])
                    ar[1]=res;
            }
        }
        if(ar[0]>ar[1])
            System.out.println(1+" "+ar[0]);
        else
            System.out.println(2+" "+ar[1]);
    }
}
