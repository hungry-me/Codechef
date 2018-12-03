package beginner;
import java.util.Scanner;
public class DownloadFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int z=0;z<t;z++){
            int n=sc.nextInt(),k=sc.nextInt();
            int cst=0;
            for (int i=0;i<n;i++){
                int tm=sc.nextInt(),d=sc.nextInt();
                if(k>=tm){
                    k-=tm;
                    continue;
                }
                cst+=(tm-k)*d;
                k=0;
            }
            System.out.println(cst);
        }
    }
}
