package beginner;
import java.util.Scanner;
public class ForgottenLanguage {
    public static int[] count(String ar1[],int cn[],String sen[]){
        for (int i=0;i<ar1.length;i++){
            for (int j=0;j<sen.length;j++){
                if(ar1[i].equals(sen[j])){
                    cn[i]++;
                    break;
                }
            }
        }
        return cn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int sz=sc.nextInt(),n=sc.nextInt();
            String wr[]=new String[sz];
            int ar[]=new int[sz];
            for (int j=0;j<sz;j++)
                wr[j]=sc.next();
            for (int j=0;j<n;j++){
                int w=sc.nextInt();
                String sen[]=new String[w];
                for (int k=0;k<w;k++)
                    sen[k]=sc.next();
                ar=count(wr,ar,sen);
            }
            for (int j=0;j<sz;j++){
                if(ar[j]!=0)
                    System.out.print("YES ");
                else
                    System.out.print("NO ");
            }
            System.out.println();
        }
    }
}
