package beginner;
import java.util.Scanner;
public class MovieWeekend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int l[]=new int[n];
            int r[]=new int[n];
            for (int j=0;j<n;j++)
                l[j]=sc.nextInt();
            for (int j=0;j<n;j++)
                r[j]=sc.nextInt();
            int mx=-99999,prev=0,mxr=-9999;
            for (int j=0;j<n;j++){
                int res=l[j]*r[j];
                if(res>=mx)
                {
                    mx=res;
                    if(mxr<r[j]) {
                        mxr = r[j];
                        prev=j;
                    }
                }
            }
            System.out.println(prev+1);
        }
    }
}
