package beginner;
import java.util.Scanner;
public class SmallNoOfNotes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int cr[]={1,2,5,10,50,100};
        for (int i=0;i<t;i++){
            int j=cr.length-1,cn=0;
            int n=sc.nextInt();
            while(n!=0){
                if(n>=cr[j])
                {
                    n-=cr[j];
                    cn++;
                }
                else
                    j--;
            }
            System.out.println(cn);
        }
    }
}
