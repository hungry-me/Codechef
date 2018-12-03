package beginner;
import java.util.Scanner;
public class CuttingRecipes {
    public static int getGcd(int a,int b){
        if(a==0)
            return b;
        return getGcd(b%a,a);
    }
    public static int gcd(int ar[]){
        int n=ar.length;
        int res=ar[0];
        for (int i=1;i<n;i++)
            res=getGcd(res,ar[i]);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int ar[]=new int[n];
            for (int j=0;j<n;j++)
                ar[j]=sc.nextInt();
            int g=gcd(ar);
            for (int j=0;j<n;j++)
                System.out.print(ar[j]/g+" ");
            System.out.println();
        }
    }
}
