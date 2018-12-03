package beginner;
import java.util.Scanner;
public class CielAndReceipt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ar[]={1,2,4,8,16,32,64,128,256,512,1024,2048};
        for (int i=0;i<t;i++){
            int p=sc.nextInt();
            int cn=0,j=ar.length-1;
            while(p!=0){
                if(p>=ar[j]){
                    p-=ar[j];
                    cn++;
                }
                else
                    j--;
            }
            System.out.println(cn);
        }
    }
}
